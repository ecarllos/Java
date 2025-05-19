//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Declarando a variável 'num'
        int num = 1_000_000;

        // Imprimindo a soma de num + 2
        System.out.println(num + 2);


        if (num > 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

        int[] numeros = {10, 20, 30};

        // Imprimindo os valores do array
        System.out.println("Valores no array:");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        
    }
}