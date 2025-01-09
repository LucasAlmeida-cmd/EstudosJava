package estudo2.dominio;
public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacao;

    public Musica(String titulo, String artista, int avaliacao, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.avaliacao = avaliacao;
        this.anoLancamento = anoLancamento;

    }

    public void retornaFicha(){
        System.out.println("Título: "+ titulo+"\nArtista principal: "+ artista+"\nAno de lançamento: " + anoLancamento +
                "\nAvaliação: "+ avaliacao+ "\nNumeros de avaliações: "+ numAvaliacao );
    }

    public void avaliarMusica(int nota){
        numAvaliacao++;
        avaliacao += nota;
    }

    public int retornaMedia(){
        return avaliacao/numAvaliacao;
    }
}
