package ab02;

public class Aufgabe22 {
    public static void main(String[] args) {
        boolean[] booleans = {true, false, true, false};
        char[] chars = {'a', 'b', '4', '3', 'k', 'r', 'Ж'};
        for(int i = (booleans.length/2)-1; i < booleans.length-1; i++) {
            System.out.print(booleans[i] + " ");
        }
        System.out.println();
        int i = 0;
        while(i < chars.length) {
            if(!(i == (chars.length/2))) {
                System.out.print(chars[i] + " ");
            }
            i++;
        }
    }

}
