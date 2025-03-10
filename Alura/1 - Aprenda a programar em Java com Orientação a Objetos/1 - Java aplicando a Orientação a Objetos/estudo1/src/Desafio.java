import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "Lucas Almeida Fernandes de Moraes";
        String tipoConta = "Corrente";
        double saldoInicial = 1500.00;

        System.out.println("**********************************************");
        System.out.println("Nome:          "+ nome);
        System.out.println("Tipo de conta: "+ tipoConta);
        System.out.println("Saldo Inicial: R$"+ saldoInicial);
        System.out.println("**********************************************");


        boolean x = true;
        while(x){

            System.out.println("Operações: ");

            System.out.println("1 - Consultar Saldo:");
            System.out.println("2 - Receber Valor:" );
            System.out.println("3 - Enviar Valor");
            System.out.println("4 - Fechar");

            int escolha = sc.nextInt();

            if (escolha == 1 ){
                System.out.println("R$"+saldoInicial);
            } else if (escolha == 2 ) {
                System.out.println("Digite o valor para receber:  ");
                double valor = sc.nextDouble();
                saldoInicial += valor;
                System.out.println("Saldo atualizado: R$"+ saldoInicial);
            } else if (escolha == 3 ) {
                System.out.println("Digite o valor para enviar: ");
                double valor = sc.nextDouble();
                if (valor > saldoInicial){
                    System.out.println("Impossível realizar operação!");
                }else {
                    saldoInicial -= valor;
                    System.out.println("Saldo atualizado: R$"+saldoInicial);
                }
            } else if (escolha == 4) {
                System.out.println("Obrigado!!");
                x = false;
            }else{
                System.out.println("Opção inválida!");
            }


        }
    }
}

