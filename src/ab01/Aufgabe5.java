package ab01;

public class Aufgabe5 {
    public static void main(String[] args) {
        float a = 2.5f;
        float b = 3.5f;
        System.out.println("a="+a);
        System.out.println("b="+b);
        float c = a;
        a = b;
        b = c;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
