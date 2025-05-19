import java.util.Scanner;

public class a03_operadores {
    public static void main(String[] args) {
        System.out.print("digite um número: ");
        Scanner num1 = new Scanner(System.in);
        int n1 = Integer.parseInt(num1.nextLine());

        System.out.print("digite outro número: ");
        Scanner num2 = new Scanner(System.in);
        int n2 = Integer.parseInt(num2.nextLine());

        System.out.println("A soma de " + n1 + "+" + n2 + "=" + (n1+n2));
    }
}
