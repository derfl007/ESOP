package ab02;

public class Aufgabe19 {
    public static void main(String[] args) {
        for(int i = 176; i <= 255; i++) {
            char c = (char) i;
            System.out.print(c + (((i - 175) % 20 == 0) ? "\n" : " "));
        }
    }
}
