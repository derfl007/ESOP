package ab04;

import java.util.Scanner;

public class Aufgabe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        System.out.println(removeDoubleWords(in));
    }

    private static String removeDoubleWords(String s) {
        String[] words = s.split(" ");
        words[0] += " ";
        for(int i = 1; i < words.length; i++) {
            words[i] += " ";
            if((words[i]).equals(words[i - 1])) {
                words[i] = "";
            }
        }
        StringBuilder res = new StringBuilder();
        for(String word : words) {
            res.append(word);
        }
        return res.toString();
    }
}
