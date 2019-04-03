package ab03;

public class Aufgabe3 {
    public static void main(String[] args) {
        System.out.println(m1(3));
    }
    private static int m1(int p0) {
        return m2(p0) * 2;
    }
    private static int m2(int p0) {
        return p0 + 1;
    }
}
