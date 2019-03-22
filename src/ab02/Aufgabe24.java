package ab02;

import java.util.Arrays;

public class Aufgabe24 {
    public static void main(String[] args) {
        int[] ints = {10, 16, 5, 34, 88, 3};
        int sum = 0;
        for(int i : ints) {
            sum += i;
        }
        System.out.println(sum);
    }
}
