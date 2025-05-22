import java.util.Scanner;

public class a03_operadores {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.print("digite um número: ");
        int n1 = num1.nextInt();

        System.out.print("digite outro número: ");
        int n2 = num1.nextInt();

        System.out.println("A soma de " + n1 + "+" + n2 + "=" + (n1+n2));
    }
}
