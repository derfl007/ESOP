package ab03;

import java.util.Arrays;

public class Aufgabe28 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5};
        System.out.println(Arrays.toString(convert(a)));
    }
    
    private static int[] convert(int[] a) {
        int[] res = new int[a.length];

        int last = a[0];
        int currentCount = 0;
        int index = 0;
        for (int value : a) {
            if (value == last) {
                currentCount++;
            } else {
                res[index++] = last;
                res[index++] = currentCount;
                currentCount = 1;
                last = value;
            }
        }
        res[index++] = last;
        res[index] = currentCount;
        int size = (int) Arrays.stream(res).filter(value -> value != 0).count();
        return Arrays.copyOf(res, size);
    }
}
