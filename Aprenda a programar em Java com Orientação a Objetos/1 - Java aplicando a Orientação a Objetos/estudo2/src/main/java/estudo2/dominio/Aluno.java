package estudo2.dominio;
public class Aluno {

    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade);
    }
}
