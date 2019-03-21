package ab02;

import java.lang.reflect.Array;

public class Aufgabe20 {
    public static void main(String[] args) {
        Double[] doubles = {1.5, 2.66, -2.0, 3.1, 10.0};
        Boolean[] booleans = {true, false, true, false};
        Integer[] ints = {10, 16, 5, 34, 88, 3};
        Character[] chars = {'a', 'b', '4', '3', 'k', 'r', 'Ж'};
        String[] strings = {"Hugo", "Berta", "4.5", "Sara", "3Q"};
        System.out.println(printFirstAndLast(doubles));
        System.out.println(printFirstAndLast(ints));
        System.out.println(printFirstAndLast(booleans));
        System.out.println(printFirstAndLast(chars));
        System.out.println(printFirstAndLast(strings));

    }
    private static <type> String printFirstAndLast(type[] a) {
        return a[0] + ", " + a[Array.getLength(a)-1];
    }
}
