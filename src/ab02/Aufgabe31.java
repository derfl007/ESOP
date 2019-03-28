package ab02;

import java.util.Scanner;

public class Aufgabe31 {
    public static void main(String[] args) {
        boolean[] a = { true, false, true };
        boolean[] b = { false, false, true };
        int diff = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) diff++;
        }
        System.out.println(diff);
    }

}
