import java.util.Scanner;

public class a07_Metodos {
    // Faça uma calculadora utilizando métodos em Java
    public static void main(String[] args) {


        mostrarCalculadora();

    }
    public static void mostrarCalculadora(){
        Scanner scanner = new Scanner(System.in);

        // Quiz
        System.out.println("******** CALCULADORA ********");
        System.out.println("Digite a operação que você quer fazer:");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("");

        System.out.print("Digite sua resposta: ");
        int operacao = scanner.nextInt();

        System.out.print("Didite o primeiro número para fazer o cálculo: ");
        int n1 = scanner.nextInt();
        System.out.print("Didite o primeiro número para fazer o cálculo: ");
        int n2 = scanner.nextInt();

        if (operacao == 1){
            int soma = Somar(n1, n2);
            System.out.println("A Soma desses números é igual a " + soma);
        } else if (operacao == 2){
            int sub = Subtrair(n1, n2);
            System.out.println("A Subtração desses números é igual a " + sub);
        } else if (operacao == 3){
            int mult = Multiplicar(n1, n2);
            System.out.println("A multiplicação desses números é igual a " + mult);
        } else if (operacao == 4){
            int div = Dividir(n1, n2);
            System.out.println("A Divisão desses números é igual a " + div);
        }
    }

    public static int Somar(int a, int b){
        return a + b;
    }
    public static int Subtrair(int a, int b){
        return a - b;
    }
    public static int Multiplicar(int a, int b){
        return a * b;
    }public static int Dividir(int a, int b){
        return a / b;
    }

}
