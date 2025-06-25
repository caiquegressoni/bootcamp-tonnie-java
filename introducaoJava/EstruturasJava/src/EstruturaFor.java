import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args){
        for(var i = 1 ; i < 100; i++){
            if(i == 90) break;
            System.out.println(i);
        }
    }
}
/*TODO codigo exemplo*/
        /*for(;;){ //TODO for sem validação para ter fim; ou seja infinito;
            System.out.printf("Digite seu nome: ");
            var name = sc.next();

            if(name.equalsIgnoreCase("exit")) break;
            //TODO metodo que combina switch case legado, com a função equalsIgnoreCase, para podeer sair do for
            System.out.println(name);
        } //TODO estrutura de for que ficara rodando infinitamenta a menos que seja solicitado sua para parada.*/
