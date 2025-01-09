package estudo2.dominio;

public class Filme {

    private String nomeFilme;
    private int anoFilme;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    public Filme(String nomeFilme, int anoFilme, boolean incluidoNoPlano, double avaliacao, int totalAvaliacao, int duracaoEmMinutos) {
        this.nomeFilme = nomeFilme;
        this.anoFilme = anoFilme;
        this.incluidoNoPlano = incluidoNoPlano;
        this.avaliacao = avaliacao;
        this.totalAvaliacao = totalAvaliacao;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void darAvaliacao(double nota){
        avaliacao += nota;
        totalAvaliacao++;
    }

    public double retornaMediaAvaliacao(){
        return avaliacao/totalAvaliacao;
    }

}