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


        /*
        int maxTemperature = 0; // Initialize maximum temperature observed

        boolean ver = false;

        // Add your while loop or do-while loop here to process input temperatures
        while (maxTemperature<100){
            int temp = scanner.nextInt();

            if (temp>=100){
                break;
            }
            if (!ver || temp > maxTemperature){
                maxTemperature = temp;
                ver = true;
            }
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);*/



        /*Como entrada, o programa recebe uma sequência de números inteiros não negativos;
        cada número inteiro é escrito em uma linha separada. A sequência termina com um número inteiro 0;
        quando o programa lê 0, ele deve encerrar seu trabalho e gerar o comprimento da sequência (sem contar o 0 final).*/

        /*int cont = 0;
        int n;
        int c = 0;

        do {
            n = scanner.nextInt();
            cont++;

            if (n > c){
                c = n;
            }
        } while (n != 0);

        // System.out.println(cont-1);
        System.out.println(c);*/


        // Faça 2 pirâmides de números uma com a base pra baixo e a outra com a base para cima
      
      /*for (int j = 1; j < 10 ;j++){
        for (int i = 1; i < j; i++){
          System.out.print(i);
        }
        System.out.println(j);
      }*/
      
      
      for(int j = 9; j>0; j--){
        
        for(int i = 1; i<j; i++){
          System.out.print(i);
        }
        System.out.println(j);
      }
  }
}
    }
}
