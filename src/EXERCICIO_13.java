import java.util.Scanner;

public class EXERCICIO_13 {

    //Exercicio 13: Construir um programa Java que crie um menu na tela com as seguintes opções.
// MENU PRINCIPAL
// 1 - ENTRAR COM DADOS DA CONTA
// 2 - DEPOSITAR
// 3 - SACAR
// 4 - VER SALDO
// 5 - SAIR
// Os dados da conta são : NOME, NUMER DA CONTA e SALDO.

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        int numeroDaConta;
        double deposito;
        double sacar;
        double saldo = 0;
        int agencia;

        int opcao = 0;
        while (opcao!=5){
            System.out.println("Escolha uma opção:");
            System.out.println("Menu principal.");
            System.out.println("1 - Entrar com dados da conta.");
            System.out.println("2 - Depositar.");
            System.out.println("3 - Sacar.");
            System.out.println("4 - Ver saldo.");
            System.out.println("5 - Sair.");

            opcao = entrada.nextInt();

            if (opcao == 1){
                System.out.println("Entrar com dados da conta");
                System.out.println("Digite seu nome:");
                nome = entrada.next();
                System.out.println("Digite seu numero de conta.");
                numeroDaConta = (Integer.parseInt(entrada.next()));
                System.out.println("Digite sua agência.");
                agencia = (Integer.parseInt(entrada.next()));
                System.out.println("Digite seu saldo");
                saldo = (Double.parseDouble(entrada.next()));


            }
            else if (opcao == 2){
                System.out.println("Depositar.");
                System.out.println("Digite o valor para deposito");
                deposito = entrada.nextDouble();
                System.out.println("Valor depositado: R$"+deposito);
                saldo = saldo + deposito;
            }

            else if (opcao == 3 ){
                System.out.println("Sacar.");
                System.out.println("Digite o valor para saque.");
                sacar = entrada.nextDouble();
                System.out.println("Valor sacado: R$"+sacar);
                saldo = saldo - sacar;
            }
            else if (opcao == 4) {
                System.out.println("Ver saldo.");
                System.out.println("Seu saldo é: R$"+saldo);
            }
            else if (opcao == 5) {
                System.out.println("Sair.");
            }
            else {
                System.out.println("Opção inválida.");
            }


        }




    }




}
