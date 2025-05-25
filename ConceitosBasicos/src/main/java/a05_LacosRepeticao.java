import java.util.Scanner;

public class a05_LacosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        int QntdDeNum = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < QntdDeNum; i++){
            int n = scanner.nextInt();

            if (n % 6 == 0){
                soma += n;
            }
        }

        System.out.println(soma);
    }
}
