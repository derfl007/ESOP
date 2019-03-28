package ab02;

public class Aufgabe30 {
    public static void main(String[] args) {
        char[] array = {'L', 'G', 'N', 'U', 'T', 'R', 'F', 'E', 'A', 'K'};
        for (int i = array.length - 1; i > array.length / 2 - 1; i--) {
            System.out.print(array[i] + "" + array[array.length - 1 - i]);
        }
    }
}