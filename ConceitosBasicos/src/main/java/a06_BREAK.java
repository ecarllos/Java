// import java.util.Scanner;

public class a06_BREAK {
    public static void main(String[] args) {

        // Faça uma escada de números com 10 degraus
        /*for(int i = 0;i < 10; i++){
            for(int j = 0;j < 10; j++){
                System.out.print(j + "");

                if (i == j){
                    break;
                }
            }
            System.out.println();
        }*/


        // -------------------------------------------------


        // digite apeas os números pares de 1 a 10 usando o CONINUE

        for(int i = 0; i<10; i++){

            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
