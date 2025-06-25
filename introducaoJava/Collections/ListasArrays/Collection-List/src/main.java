import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args){
        int[] code = {12, 332, 44, 90};
        System.out.println(code.length);
        System.out.println(code[0]);
        System.out.println(code[1]);
        System.out.println(code[2]);
        System.out.println(code[3]);
        System.out.println("----");
        List<Integer> lista = new ArrayList<>();
        lista.add(code[0]);
        lista.add(code[1]);
        lista.add(code[2]);
        lista.add(code[3]);
        lista.forEach(System.out::println);
    }
}    
