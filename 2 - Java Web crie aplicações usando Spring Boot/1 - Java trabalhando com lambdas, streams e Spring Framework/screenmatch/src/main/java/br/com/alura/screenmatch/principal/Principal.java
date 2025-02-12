package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodios;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporadas;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner sc = new Scanner(System.in);

    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=2b59882c";

    public void exibiMenu(){
        System.out.println("Digite o nome da Série: ");
        var nomeSerie = sc.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println("Converdento: " + dadosSerie);

        List<DadosTemporadas> temporadas = new ArrayList<>();
		for (int i = 1; i <= dadosSerie.totalTemp() ; i++) {
            json = consumo.obterDados(ENDERECO+nomeSerie.replace(" ", "+") +"&season="+ i +API_KEY);
			DadosTemporadas dadosTemporadas = conversor.obterDados(json, DadosTemporadas.class);
			temporadas.add(dadosTemporadas);
		}

		temporadas.forEach(System.out::println);

//        for (int i = 0; i < dadosSerie.totalTemp(); i++) {
//            List<DadosEpisodios> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<DadosEpisodios> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());


//        System.out.println("\nTop 10 episodios");
//        dadosEpisodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .peek(e -> System.out.println("Primeiro Filtro(N/A)" + e))
//                .sorted(Comparator.comparing(DadosEpisodios::avaliacao).reversed())
//                .peek(e -> System.out.println("Ordenação" + e))
//                .limit(10)
//                .peek(e -> System.out.println("Limit" + e))
//                .map(e -> e.titulo().toUpperCase())
//                .peek(e -> System.out.println("Mapeamento" + e))
//                .forEach(System.out::println);
//

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d))
                ).collect(Collectors.toList());


        episodios.forEach(System.out::println);


//        System.out.println("Digite o nome do ep: ");
//        var nomeEP = sc.nextLine();
//
//        Optional<Episodio> episodioOptional = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(nomeEP.toUpperCase()))
//                .findFirst();
//
//        if(episodioOptional.isPresent()){
//            System.out.println("Episódio encontrado!");
//            System.out.println("Temporada: "+ episodioOptional.get().getTemporada());
//        }else{
//            System.out.println("Não encontrado!");
//        }

//
//        System.out.println("A partir de que ano você deseja ver ?");
//        var ano = sc.nextInt();
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//
//
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
//                .forEach(e -> System.out.println("Temporadas: "+ e.getTemporada() +
//                        "Episodio: " + e.getTitulo() +
//                        "Data Lançamento: " +e.getDataLancamento().format(formatador)));


        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));


        System.out.println(avaliacoesPorTemporada);


        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));

        System.out.println("Média: "+ est.getAverage());
        System.out.println("Melhor EP: "+ est.getMax());
        System.out.println("Pior EP: "+ est.getMin());
        System.out.println("Quantidade: "+est.getCount());














    }
}
