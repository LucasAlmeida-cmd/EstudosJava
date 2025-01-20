package estudo4.dominio.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import estudo4.dominio.excecao.ErroDeConversaoDeAnoException;
import estudo4.dominio.modelos.Titulo;
import estudo4.dominio.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();


        while (!busca.equalsIgnoreCase("Sair")) {

            System.out.println("Informe o nome de um filme: ");
            busca = sc.next();
            if (busca.equalsIgnoreCase("sair")){
                break;
            }



            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.omdbapi.com/?t=" + busca + "&apikey=2b59882c"))
                    .build();
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();



//        Titulo titulo = gson.fromJson(json, Titulo.class);


                TituloOmdb titulo = gson.fromJson(json, TituloOmdb.class);
                System.out.println(titulo);

                Titulo meuTitulo = new Titulo(titulo);
                System.out.println(meuTitulo);


                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Endereço invalido: " + e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println("Aconteceu alguma coisa: " + e.getMessage());
            }

        }


        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        System.out.println("Finalizou");

    }

}
