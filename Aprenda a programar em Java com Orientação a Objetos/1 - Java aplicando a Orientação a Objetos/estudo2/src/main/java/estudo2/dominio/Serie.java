package estudo2.dominio;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEp;

    public Serie(String nomeFilme, int anoFilme, boolean incluidoNoPlano, int duracaoEmMinutos, int totalAvaliacao, double avaliacao, int temporadas, boolean ativa, int episodiosPorTemporada, int minutosPorEp) {
        super(nomeFilme, anoFilme, incluidoNoPlano, duracaoEmMinutos, totalAvaliacao, avaliacao);
        this.temporadas = temporadas;
        this.ativa = ativa;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEp = minutosPorEp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada / minutosPorEp;
    }
}
