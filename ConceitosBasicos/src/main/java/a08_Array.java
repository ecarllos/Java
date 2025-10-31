import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class a08_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie uma matriz de longs chamada longN números com três elementos 100000000001, 100000000002, 100000000003.
        // long[] longNumbers = {100000000001L, 100000000002L, 100000000003L};
        // System.out.println(Arrays.toString(longNumbers));


        /* Escreva um programa que realize as seguintes tarefas:
        1. Aceita um inteiro 'n' como entrada, o que indica o número de elementos que devem estar no array.
        2. Depois, aceita 'n' números inteiros como entrada para os elementos do array.
        3. O programa deve então calcular a soma de todos os elementos no array que são múltiplos de 3.
        4. Imprime a soma desses números como saída. */


        // read the number of elements



        /*int cont = scanner.nextInt();

        // create your array here
        int[] numbers = new int[cont];
        int soma = 0;
        // use a loop to read the array elements
        for (int i = 0; i < cont; i++){
            int n = scanner.nextInt();

            if (n % 3 == 0){
                numbers[i] = n;
                soma += n;
            }
        }

        System.out.println(soma);*/
        // close the scanner



        /*
        // Pegue o nome de 5 pessoas e retorne-os

        String[] array = new String[5];
        int soma = 0;

        for (int i = 0; i < array.length; i++){
            System.out.print("digite um nome: ");
            String n = scanner.next();

            array[i] = n;
        }

        System.out.println(Arrays.toString(array));
        */




        // Crie uma matriz 3x3 e mostre a soma de todos os elementos

        /*
        int soma = 0;

        int[][] elements = {
          {2, 7, 14},
          {12, 9, 1}
        };

        for (int i = 0; i < elements.length; i++){
            for (int j = 0; j < elements[i].length; j++){
                soma += elements[i][j];
                System.out.println(elements[i][j]);
            }
        }
        System.out.println("a soma dessa matriz é " + soma);
        */


        scanner.close();
    }
}
