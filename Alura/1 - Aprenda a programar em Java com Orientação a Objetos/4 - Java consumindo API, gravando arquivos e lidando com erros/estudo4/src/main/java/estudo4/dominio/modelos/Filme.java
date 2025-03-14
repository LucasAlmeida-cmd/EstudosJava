package estudo4.dominio.modelos;


import estudo4.dominio.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;


    public Filme(int anoDeLancamento, String nome, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos, String diretor) {
        super(anoDeLancamento, nome, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return  "Filme: "+ getNome()+ " ("+getAnoDeLancamento()+")";
    }

}
