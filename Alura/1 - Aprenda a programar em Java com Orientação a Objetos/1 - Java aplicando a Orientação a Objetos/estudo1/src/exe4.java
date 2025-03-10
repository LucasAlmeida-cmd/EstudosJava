import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

//        Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num +" X " + i +" = "+ i*num);
        }



    }
}
