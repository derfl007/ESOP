package ab04;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        char[] cArr = s.toLowerCase().toCharArray();
        boolean res = false;
        for(int i = 0; i < cArr.length / 2; i++) {
            res = cArr[i] == cArr[cArr.length - 1 - i];
            if(!res) break;
        }
        return res;
    }
}
