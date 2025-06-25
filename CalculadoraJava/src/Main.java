import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        var valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        var valor2 = scanner.nextInt();

        System.out.print("Informe o operador (+, -, *, /): ");
        var operador = scanner.next();

        int result = 0;

        if (operador.equals("+")) {
            result = valor1 + valor2;
        }

        if (operador.equals("-")) {
            result = valor1 - valor2;
        }

        if (operador.equals("*")) {
            result = valor1 * valor2;
        }

        if (operador.equals("/")) {
            result = valor1 / valor2;
        }

        System.out.print("O resultado é: " + result);
    }
}