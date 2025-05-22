import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int f = scanner.nextInt();
        int a = scanner.nextInt();

        if (c <= f && a >= c && a <= f){
            System.out.println("Normal");
        } else if (a > f) {
            System.out.println("Excess");
        } else if (a < c) {
            System.out.println("Deficiency");
        }
    }
}
