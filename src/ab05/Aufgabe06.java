package ab05;

public class Aufgabe06 {
    public static void main(String[] args) {
        System.out.println(itFibo(7));
        System.out.println(recFibo(7));
    }

    private static int itFibo(int n) {
        if(n <= 2) return 1;
        int last1 = 1;
        int last2;
        int current = 1;
        for (int i = 2; i < n; i++) {
            last2 = last1;
            last1 = current;
            current = last1 + last2;
        }
        return current;
    }

    private static int recFibo(int n) {
        if(n <= 2) return 1;
        return recFibo(n-1) + recFibo(n-2);
    }
}
