import java.util.Scanner;

public class a07_Metodos {
    // Faça uma calculadora utilizando métodos em Java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz
        System.out.println("******** CALCULADORA ********");
        System.out.println("Digite a operação que você quer fazer:");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[5] Sobra da divisão");
        System.out.println("");

        System.out.print("Digite sua resposta: ");
        int operacao = scanner.nextInt();
        System.out.println("");

        // Validação para o usuário não digitar algum número errado
        for (boolean i = false; operacao <= 0 || operacao >= 5;){

            System.out.println("Digite um número de 1 a 5!!");

            System.out.print("Digite um número novamente: ");
            operacao = scanner.nextInt();
            System.out.println("");

            if (operacao >= 1 || operacao <= 5){
                i = true;
            }
        }


        // perguntando os números para realizar o cálculo
        System.out.print("Digite o primeiro número para fazer o cálculo: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número para fazer o cálculo: ");
        int n2 = scanner.nextInt();

        mostrarCalculadora(operacao, n1, n2);

        scanner.close();
    }
    public static void mostrarCalculadora(int operacao, int n1, int n2){

        switch (operacao){
            case 1:
                System.out.println("A Soma desses números é igual a " + somar(n1, n2));
                break;
            case 2:
                System.out.println("A Subtração desses números é igual a " + subtrair(n1, n2));
                break;
            case 3:
                System.out.println("A Multiplicação desses números é igual a " + multiplicar(n1, n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Não é possível reakizar divisão com ZERO!!");
                    break;
                }
                System.out.println("A Divisão desses números é igual a " + dividir(n1, n2));
                break;

            case 5:
                if (n2 == 0){
                    System.out.println("Não é possível reakizar divisão com ZERO!!");
                    break;
                }
                System.out.println("A Sobra de " + n1 + " % " + n2 + " é = " + sobra(n1, n2));
                break;
        }
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }
    public static int sobra(int a, int b){
        return a % b;
    }
}
