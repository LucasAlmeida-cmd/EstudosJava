package estudo4.dominio.principal;



import estudo4.dominio.modelos.Filme;
import estudo4.dominio.modelos.Serie;
import estudo4.dominio.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970, "O poderoso chefão", true, 0, 0, 180, "Lucas");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme(2023, "Avatar", false, 0, 0, 200, "Lucas");
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme(2003, "Dogville", false, 0, 0, 200, "Lucas");
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie(2000, "Lost", true, 0, 0 , 60, 5, true, 24, 60);


        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        //Collections.sort(lista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
