package ab04;

import java.util.Scanner;

public class Aufgabe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(convertToMorse(s));
    }

    private static String convertToMorse(String s) {
        char[] cArr = s.toUpperCase().toCharArray();
        StringBuilder morseCode = new StringBuilder();
        for(char c : cArr) {
            morseCode.append(getMorseCode(c)).append(" ");
        }
        return morseCode.toString();
    }

    private static String getMorseCode(char c) {
        String morse;
        switch(c) {
            case 'A': morse = ".-";     break;
            case 'B': morse = "-...";   break;
            case 'C': morse = "-.-.";   break;
            case 'D': morse = "-..";    break;
            case 'E': morse = ".";      break;
            case 'F': morse = "..-.";   break;
            case 'G': morse = "--.";    break;
            case 'H': morse = "....";   break;
            case 'I': morse = "..";     break;
            case 'J': morse = ".---";   break;
            case 'K': morse = "-.-";    break;
            case 'L': morse = ".-..";   break;
            case 'M': morse = "--";     break;
            case 'N': morse = "-.";     break;
            case 'O': morse = "---";    break;
            case 'P': morse = ".--.";   break;
            case 'Q': morse = "--.-";   break;
            case 'R': morse = ".-.";    break;
            case 'S': morse = "...";    break;
            case 'T': morse = "-";      break;
            case 'U': morse = "..-";    break;
            case 'V': morse = "...-";   break;
            case 'W': morse = ".--";    break;
            case 'X': morse = "-..-";   break;
            case 'Y': morse = "-.--";   break;
            case 'Z': morse = "--..";   break;
            default: morse = String.valueOf(c); break;
        }
        return morse;
    }
}
