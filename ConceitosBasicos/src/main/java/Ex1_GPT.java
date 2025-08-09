import java.util.Scanner;

public class Ex1_GPT {
    public static void main(String[] args) {
        // Controle de Acesso (Idade && VIP)
        Scanner scanner = new Scanner(System.in);

        // perguntando a idade
        System.out.print("Qual a sua idade: ");
        int idade = scanner.nextInt();
        //System.out.println("");

        // perguntando sobre o convite
        System.out.print("Você possui convite? (true/false): ");
        boolean vip = scanner.nextBoolean();
        System.out.println("");

        if (idade >= 18 || vip){
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso Negado!");
        }

        scanner.close();
    }
}
