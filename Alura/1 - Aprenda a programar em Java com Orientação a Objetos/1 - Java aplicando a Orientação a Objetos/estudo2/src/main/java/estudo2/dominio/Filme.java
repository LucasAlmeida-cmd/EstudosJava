package estudo2.dominio;

public class Filme extends Titulo {


    private String diretor;

    public Filme(String nomeFilme, int anoFilme, boolean incluidoNoPlano, int duracaoEmMinutos, int totalAvaliacao, double avaliacao, String diretor) {
        super(nomeFilme, anoFilme, incluidoNoPlano, duracaoEmMinutos, totalAvaliacao, avaliacao);
        this.diretor = diretor;
    }
}
