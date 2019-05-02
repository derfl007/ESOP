package ab03;

public class Aufgabe26 {
    public static void main(String[] args) {
        int[] x = {2, 8, 3, 4, 5};
        int[] y = {1, 6, 7, 2, 3};
        System.out.println(skalarProd(x, y));
    }

    private static int skalarProd(int[] x, int[] y) {
        int prod = 0;
        for(int i = 0; i<x.length; i++) {
            prod += x[i]*y[i];
        }
        return prod;
    }
}
