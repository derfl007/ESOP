package ab02;

import java.util.Scanner;

public class Aufgabe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] testArray = input.toCharArray();
        boolean isPalindrome = true;

        for(int i = 0; i < testArray.length / 2; i++) {
            if(testArray[i] != testArray[testArray.length-1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The character string is " + (isPalindrome ? "a " : "not a ") + "Palindrom.");
    }
}