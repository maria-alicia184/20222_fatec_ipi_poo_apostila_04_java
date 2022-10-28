//4 Classe de Teste
import java.lang.Math;
public class TesteCalculadoraCientifica {
    public static void main(String [] args){

        //raiz
        int a = 25;
        System.out.println(Math.sqrt(a));

        double b = 5.5;
        System.out.println(Math.sqrt(b));

        String s = "100";
        System.out.println(Math.sqrt(Double.parseDouble(s)));

        //potencia
        int x = 2;
        int y = 3;
        double n1 = x;
        double n2 = y;
        System.out.println(Math.pow(n1,n2));

        String s1 = "3";
        String s2 = "2";
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        System.out.println(Math.pow(d1, d2));

        int i = 5;
        double i2 = i;
        double d = 2;
        System.out.println(Math.pow(i2, d));
    }
}
