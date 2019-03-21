package ab01;

public class Aufgabe9 {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 500;
        int c = a+b;
        System.out.println(c);
        //c ist negativ, da sich durch das addieren der erste bit der int variable ändert, welcher bestimmt ob die variable positiv oder negativ ist
    }
}
