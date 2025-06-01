import java.util.Scanner;

public class Main {

    //TODO aqui colocar variaveis globais seguindo o modelo: EXEMPLO_VARGLOBAL

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu nome é: ");
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Quanto é 4+4?");
        int result = scanner.nextInt();
        boolean isRight = result == 8;
        System.out.println(isRight);

        var canDrive = age >= 18;
        System.out.println("Você possui CNH (S/N):");
        var possuiCNH = scanner.next();


        System.out.printf("Seu nome é %s, e você tem %d anos. ", name, age);

        if(canDrive && possuiCNH.equals("S")){ //TODO Funcão que valida se pessoa é maior que 18 e tem CNH
            System.out.println("Você pode dirigir");
        }else{
            System.out.println("Você não pode dirigir");
        }

        //TODO Podemos utilizar a var em vez de String, int e Scanner, java ainda entenderá
        //TODO Fora da void main utilza-se para a criação de variaveis globai; Sua declaração deve ser em letra maiuscula
        //TODO e com seraparação por underline.
    }
}