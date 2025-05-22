import java.util.Scanner;

public class a04_Condicionais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        EXERCÍCIO 1 (quantidade de horas dormidas)

        int c = scanner.nextInt(); A variável "c" simboliza (Começo)
        int f = scanner.nextInt(); A variável "f" simboliza (Final)
        int t = scanner.nextInt(); A variável "a" simboliza (Total)

        if (c <= f && t >= c && t <= f){
            System.out.println("Normal");
        } else if (t > f) {
            System.out.println("Excess");
        } else if (t < c) {
            System.out.println("Deficiency");
        }*/



        /*EXERCÍCIO 2
        Escreva um programa que escreve "yes" se o numero for positivo e "no" pra negativo

        int n = scanner.nextInt();

        if (n >= 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        */



        /*
        EXERCÍCIO 3
        CALCULA SE UM ANO É BISEXTO OU NÃO

        int ano = scanner.nextInt();
        if (ano % 4 == 0){
            System.out.println("Leap");
        } else if (ano%100==0 && ano%100!=0 || ano%400==0) {
            System.out.println("Leap");
        }else {
            System.out.println("Regular");
        }*/




        int n = scanner.nextInt();
        if (n == 0){
            System.out.println("Zero");
        } else if (n > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
