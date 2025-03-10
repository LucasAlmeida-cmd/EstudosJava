import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {

//        Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= num; i++) {
            fat *= i;
        }

        System.out.println("Fatorial de "+ num + ", é: "+ fat);


    }
}
