import javax.sql.rowset.spi.SyncFactory;
import java.util.Scanner; // importa a biblioteca necessária para conseguir ler oq está sendo digitado pelo teclado

public class a02_Scanner {
    public static void main(String[] args) {

        System.out.print("Digite seu nome: ");
        Scanner sc = new Scanner(System.in); // inicialização da função de scanear

        String nome = sc.nextLine(); // Lê oq o usuário digita

        System.out.println("OLá, " + nome + "!");

        sc.close(); // finalização da função de scanear
    }
}
