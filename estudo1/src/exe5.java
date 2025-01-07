import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
//        Crie um programa que solicite ao usuário a entrada de um número inteiro.
//        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if(num%2 == 0 ){
            System.out.println("Numero é par");
        }else {
            System.out.println("Numero é impar");
        }
    }
}
