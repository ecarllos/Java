import java.awt.*;
import java.util.Scanner;

public class Ex1_GPT {
    public static void main(String[] args) {
        mostrar();
        funcao();
    }


    public static void limparTela(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++){
            System.out.println("");
        }
    }

    public static void mostrar(){
        // TELA INICIAL
        System.out.println("-----------BANCO-----------");
        System.out.println("1. Depositar Dinheiro");
        System.out.println("2. Sacar Dinheiro");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");
        System.out.println("");

        System.out.print("Digite a sua ação: ");

    }
    public static void funcao(){
        Scanner scanner = new Scanner(System.in);

        mostrar();
        double saldo = 1524.56;

        int option = scanner.nextInt();


        boolean i = true;

        // for (; i = true;){
            switch (option){

                case 1:
                    System.out.print("Digite o quanto você irá depositar: ");
                    double add = scanner.nextDouble();
                    saldo += add;
                    System.out.println("Saldo atual (R$:" + saldo + ")");
                    limparTela();

                    break;
                case 2:
                    System.out.println("Digite o quanto você irá sacar: ");
                    double saque = scanner.nextDouble();
                    saldo -= saque;
                    System.out.println("Saldo atual (R$:" + saldo + ")");
                    break;
                case 3:
                    System.out.println("Saldo atual (R$:" + saldo + ")");
                    break;
                case 4:
                    System.out.println("Operação Finalizada!");
                    option = 0;
                    break;
            }

        }
        // i = false;
        // scanner.close();

}

