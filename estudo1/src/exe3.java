import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
//        Crie um menu que oferece duas opções ao usuário: "" +
//                "1. Calcular área do quadrado"
//           e ("" +
//            "2. Calcular área do círculo").
//            Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolhe entre 1 para area do quadrado ou 2 para area do circulo: ");
        int num = sc.nextInt();

        if (num == 1){
            System.out.println("Digite o valor do primeiro lado: ");
            int lado1 = sc.nextInt();
            System.out.println("Digite o valor do segundo lado: ");
            int lado2 = sc.nextInt();

            System.out.println("O valor da area é: "+ lado1* lado2);
        }else {
            System.out.println("Digite o valor do raio: ");
            double raio = sc.nextDouble();
            System.out.println("Valor da area do circulo é :" + 3.14* raio* raio);
        }




    }
}
