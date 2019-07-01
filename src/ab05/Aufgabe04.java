package ab05;

public class Aufgabe04 {

    public static void main(String[] args) {
        System.out.println(itFactorial(5));
        System.out.println(recFactorial(5));
    }

    static int itFactorial(int n) {
        int res = 1;
        for(int i = n; i >= 1; i--) {
            res *= i;
        }
        return res;
    }

    static int recFactorial(int n) {
        if( n <= 1) {
            return 1;
        }
        return n * recFactorial(n - 1);
    }
}
