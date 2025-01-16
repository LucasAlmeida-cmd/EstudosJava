package estudo2;

import estudo2.dominio.Filme;

public class Main
{
    public static void main( String[] args )
    {

        Filme filme = new Filme("Harry Potter", 2002, true, 0, 0, 180, "Lucas");

        filme.darAvaliacao(10);
        filme.darAvaliacao(8.5);
        filme.darAvaliacao(7);

        System.out.println(filme.retornaMediaAvaliacao());



    }
}
