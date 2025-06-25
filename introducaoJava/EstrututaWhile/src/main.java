import java.util.Scanner;

public class main{
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        var name = "";

        while (true) {
            System.out.println("Digite seu nome (ou 'sair' para encerrar): ");
            name = sc.nextLine();
            if (name.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }
        }

        //TODO: Enquanto o While verifica primeiro a condição e depois executa o bloco de código, o Do While executa o bloco de código primeiro e depois verifica a condição.
       /* do {
            System.out.println("Digite seu nome (ou 'sair' para encerrar): ");
            name = sc.nextLine();
            if (name.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }
        } while (true); */
    }
}