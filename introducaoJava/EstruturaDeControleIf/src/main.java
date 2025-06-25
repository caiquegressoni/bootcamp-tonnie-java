package introducaoJava.EstruturaDeControleIf.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var nome = scan.nextLine();
        System.out.println("Seu nome é:" + nome);

        System.out.println("Digite sua idade: ");
        var age  = scan.nextInt();
        System.out.println("Sua idade é: " + age);

        if(age >= 18){
            System.out.println("Você pode digriri.");
        }else{
            System.out.println("Você não pode digriri.");
        }

        //TODO ?: usado para validação de verdadeiro ou falso, podendo ser usado no lugar do if
        
    }
    
}
