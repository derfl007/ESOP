package ab02;

public class Aufgabe25 {
    public static void main(String[] args) {
        int[] ints = {10, 16, 5, 34, 88, 3};
        int max = ints[0];
        int max_index = 0;
        int min = ints[0];
        int min_index = 0;
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] > max) {
                max = ints[i];
                max_index = i;
            }
            if(ints[i] < min) {
                min = ints[i];
                min_index = i;
            }
        }
        System.out.println("Max: " + max + " at " + max_index + ", Min: " + min + " at " + min_index);
    }
}
