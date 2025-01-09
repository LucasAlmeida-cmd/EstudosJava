package estudo2.dominio;

public class Carro {

    String modelo;
    int ano;
    String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void imprimirFicha(){
        System.out.println("Ano: "+ ano+ "\nModelo: "+ modelo+"\nCor: "+cor);
    }

    public int calculaIdade(){
        return 2025 - ano;
    }
}
