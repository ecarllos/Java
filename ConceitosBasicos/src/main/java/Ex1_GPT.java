import java.awt.*;
import java.util.Scanner;



public class Ex1_GPT {
    public static void main(String[] args) {
        funcao();
    }

    static double saldo = 1524.56;

    public static void limparTela(){

        for (int i = 0; i < 10; i++){
            System.out.println("");
        }
    }

    public static void mostrar(){
        // TELA INICIAL
        System.out.println("-----------BANCO-----------");
        System.out.println("1. Depositar Dinheiro");
        System.out.println("2. Sacar Dinheiro");
        System.out.println("3. Sair");
        System.out.println("");

        System.out.print("Digite a sua ação: ");

    }
    public static void funcao(){
        Scanner scanner = new Scanner(System.in);

        mostrar();


        int option = scanner.nextInt();


        boolean i = true;

        // for (; i = true;){
            switch (option){

                case 1:
                    System.out.print("Digite o quanto você irá depositar: ");
                    double add = scanner.nextDouble();
                    saldo += add;
                    limparTela();
                    System.out.println("Saldo atual (R$:" + saldo + ")");
                    funcao();
                    break;
                case 2:
                    System.out.println("Digite o quanto você irá sacar: ");
                    double saque = scanner.nextDouble();
                    saldo -= saque;
                    limparTela();
                    System.out.println("Saldo atual (R$:" + saldo + ")");
                    funcao();
                    break;
                case 3:
                    System.out.println("Operação Finalizada!");
                    break;
                default:
                    System.out.println("Digite um número correto!!");
                    System.out.println("");
                    funcao();
            }

        }
        // i = false;
        // scanner.close();

}

