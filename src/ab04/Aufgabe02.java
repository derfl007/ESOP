package ab04;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(endsWithQuestionMark(s));
    }
    private static boolean endsWithQuestionMark(String text) {
        return text.endsWith("?");
    }
}
