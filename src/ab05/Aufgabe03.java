package ab05;

public class Aufgabe03 {
    public static void main(String[] args) {
        recursiveMethod(5, 0);
    }

    private static void recursiveMethod(int n, int i) {
        System.out.println(i);
        if(i < n) recursiveMethod(n, ++i);
    }
}
