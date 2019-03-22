package ab02;

import java.util.Arrays;

public class Aufgabe23 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 2.66, -2.0, 3.1, 10.0};
        double temp = doubles[2];
        doubles[2] = doubles[3];
        doubles[3] = temp;
        System.out.println(Arrays.toString(doubles));
    }
}
