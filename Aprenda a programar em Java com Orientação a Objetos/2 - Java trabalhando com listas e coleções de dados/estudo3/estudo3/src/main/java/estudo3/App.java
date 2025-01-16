package estudo3;


import estudo3.dominio.calculos.CalculadoraDeTempo;
import estudo3.dominio.calculos.FiltroRecomendacao;
import estudo3.dominio.modelos.Episodio;
import estudo3.dominio.modelos.Filme;
import estudo3.dominio.modelos.Serie;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        Filme meuFilme = new Filme(1970, "O poderoso chefão", true, 0, 0, 180, "Lucas");
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie(2000, "Lost", true, 0, 0 , 60, 5, true, 24, 60);

        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme(2023, "Avatar", false, 0, 0, 200, "Lucas");
        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio(1, lost, "Lost", 300);
        filtro.filtra(episodio);


        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);

        System.out.println(listaFilmes);

    }
}
