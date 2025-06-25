import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GeometricForm geometricForm;

        int option;
        while(true){
            System.out.println("Escolha uma forma geométrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");

            option = sc.nextInt();

            if(option == 1){
                geometricForm = creatSquare();
            } else if (option == 2) {
                geometricForm = creatRectangle();
            } else if (option == 3) {
                geometricForm = creatCircle();
            } else if (option == 4) {
                break;
            }else {
                System.out.println("Opção invalida!");
                continue;
            }

            System.out.println("A resultado do calculo é: " + geometricForm.getArea());
        }
    }
    private static  GeometricForm creatSquare(){
        System.out.print("Informe o tamanho dos lados: ");
        var side = sc.nextDouble();
        return new Square(side);
    }
    private static GeometricForm creatRectangle(){
        System.out.println("Informe o tamanho da base: ");
        var base = sc.nextDouble();
        System.out.println("Informe o tamanho da altura");
        var height = sc.nextDouble();
        return new Rectangle(height, base);
    }
    private static GeometricForm creatCircle(){
        System.out.print("Informe o tamnho do raio: ");
        var radius = sc.nextDouble();
        return new Circle(radius);
    }
}