package ab01;

public class Aufgabe01 {
    public static void main(String[] args) {
        String str = "ESOP ist super";

        System.out.println("println(str)");
        System.out.println(str);
        System.out.println("print(str)");
        System.out.print(str);

        String[] words = str.split(" ");

        System.out.println("println() each word");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println("print() each word");
        System.out.print(words[0]);
        System.out.print(words[1]);
        System.out.print(words[2]);

    }
}
