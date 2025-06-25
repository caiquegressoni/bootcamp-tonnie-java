import java.util.Scanner;

public class Calc_Area {
    public static void main(String[] args){
        /*Fazer um codigo que calcule area de um quadro e
        exiba o resultado na tela, formula: area = lado * lado
        * */

        var sc = new Scanner(System.in);

        System.out.print("Digite quando mede o primeiro lado do quadro: ");
        var lado1 = sc.nextFloat();

        System.out.print("Digite quando mede o segundo lado do quadrado: ");
        var lado2 = sc.nextFloat();

        float area = lado1 * lado2;

        System.out.printf("A área do quadrado é %.2f", area);
    }
}
