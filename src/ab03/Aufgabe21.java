package ab03;

import java.util.Scanner;

public class Aufgabe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(replaceEverySecondChar(s, '*'));
    }

    private static char[] replaceEverySecondChar(String s, char c) {
        char[] cArr = s.toCharArray();
        for (int i = 1; i < cArr.length; i+=2) {
            cArr[i] = c;
        }
        return cArr;
    }
}
