import java.util.Scanner;
import java.time.LocalDate;
public class Calc_Idade {
    public static void main(String[] arg){
        /*
        Fazer um programa que retorne o nome do usuário e calcule a idade dele
        apartir do ano de nascimento.
        * */

        int currentYear = LocalDate.now().getYear();

        var scan = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        var name = scan.next();

        System.out.print("Informe o ano que voce nasceu: ");
        var ageBorn = scan.nextInt();

        int age = currentYear - ageBorn;

        System.out.printf("Seu nome é %s e tem %d anos", name, age);
    }
}
