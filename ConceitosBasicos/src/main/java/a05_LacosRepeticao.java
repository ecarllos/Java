import java.util.Scanner;

public class a05_LacosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------------------------  FOR  ---------------------------

        // FAÇA A SOMA ENTRE O INTERVALO DE 2 NÚMEROS QUE O USUÁRIO DIGITAR
        /*
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = 0;

        for (;a <= b;a++){
            soma += a;
        }
        System.out.println(soma);*/

        // -----------------------


        /* Encontre a soma dos números divisíveis por 6 na sequência fornecida de números naturais.
        A primeira linha da entrada é o número de elementos na sequência; as próximas linhas são os próprios elementos.
        É garantido que sempre há um número divisível por 6 na sequência. */

        /*int QntdDeNum = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < QntdDeNum; i++){
            int n = scanner.nextInt();

            if (n % 6 == 0){
                soma += n;
            }
        }

        System.out.println(soma);*/


        // ------------------


        /*Escreva um programa que imprima o produto de todos os números inteiros de a a b ( a < b ).
        Inclua a e exclua b do produto.
        Por exemplo, se a = 2 e b = 5, então a resposta é 2*3*4=24.*/

        /*
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = 1;

        for (; a<b; a++){
            soma *= a;
        }

        System.out.println(soma);
        */



        // ---------------------------  WHILE  ---------------------------

        // Faça um programa que escreva os números que o usuário digitar na tela até ele digitar o número 7
        /*
        int n;

        do {
            n = scanner.nextInt();
            System.out.println(n);
        } while (n != 7);
        */

         // Escreva uma função que some todos os números que o usuário digitar até ele digitar um número que não seja int
        /*
        int soma = 0;

        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            soma += num;
        }

        System.out.println(soma);*/


        //Escreva um programa Java que leia uma sequência de leituras de temperatura em graus Celsius
        // até que uma leitura de 100 graus ou mais seja encontrada. Seu programa deve gerar a leitura
        // de temperatura mais alta observada até aquele ponto. Você deve considerar a entrada como uma
        // sequência de valores inteiros de temperatura e imprimir o maior valor antes da condição de parada.

        int maxTemperature = 0; // Initialize maximum temperature observed
        int num = 0;

        // Add your while loop or do-while loop here to process input temperatures
        while (maxTemperature<100){
            int temp = scanner.nextInt();


            maxTemperature = temp;
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);
    }
}
