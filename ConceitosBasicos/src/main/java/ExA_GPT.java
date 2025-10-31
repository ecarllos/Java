import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ExA_GPT {
    public static void main(String[] args) {
        // Criar um mini-sistema de cadastro de tarefas (lista de tarefas) usando apenas console.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Tarefas que você irá cadastrar: ");
        int quant = scanner.nextInt();

        String[] Tarefas = new String[quant];

        for (int i = 0; i < quant; i++){
            System.out.print("Digite o nome da Tarefa que vc quer cadastrar: ");
            String Tarefa = scanner.next();

            Tarefas[i] = Tarefa;
        }

        System.out.println("Essas são as suas Tarefas: " + Arrays.toString(Tarefas));

        scanner.close();
    }
}
