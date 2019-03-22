package ab02;

public class Aufgabe21 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 2.66, -2.0, 3.1, 10.0};
        boolean[] booleans = {true, false, true, false};
        int[] ints = {10, 16, 5, 34, 88, 3};
        char[] chars = {'a', 'b', '4', '3', 'k', 'r', 'Ж'};
        String[] strings = {"Hugo", "Berta", "4.5", "Sara", "3Q"};

        for (double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println();

        for (boolean b : booleans) {
            System.out.print(b + " ");
        }
        System.out.println();

        for(int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        for(String s : strings) {
            System.out.print(s + " ");
        }
    }
}
