import java.util.Scanner;

public class Ex2_GPT {
    public static void main(String[] args) {
        // * Perguntar um número ao usuário.
        // * Mostrar a tabuada desse número de 1 a 10.
        // * **Extra:** permitir tabuada invertida (de 10 a 1) com base em escolha do usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ser transformado em tabuada: ");
        int num = scanner.nextInt();
        System.out.print("Você quer a tabuada decrescente[ 0 ] ou crescente[ 1 ]: ");
        int opcao = scanner.nextInt();
        System.out.println();

        switch (opcao){
            case 0:
                tabDecrescente(num);
                break;
            case 1:
                tabCrescente(num);
                break;
        }
        System.out.println("Tabuada Finalizada!");

    }

    public static void mult(int a, int b){
        System.out.print(a + " x " + b + " = " + a*b);
        System.out.println("");
    }

    // Tabuadas (Normal\Invertida)

    public static void tabCrescente(int n){
        for (int i = 0; i<=10; i++){
            mult(n, i);
        }
    }
    public static void tabDecrescente(int n){
        for (int i = 10; i>=0; i--){
            mult(n, i);
        }
    }
}
