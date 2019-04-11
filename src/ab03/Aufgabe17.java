package ab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aufgabe17 {
    public static void main(String[] args) {
        int[] array1 = Aufgabe12.readNumbers(3);
        int[] array2 = Aufgabe12.readNumbers(2);
        int[] erg = durchschnitt(array1, array2);
        if (erg == null) {
            System.out.println("Die beiden Arrays haben" + "keine gemeinsamen Elemente");
        } else {
            System.out.println("Die gemeinsamen Elemente beider Arrays: " + Arrays.toString(erg));
        }
    }

    private static int[] durchschnitt(int[] array1, int[] array2) {
        List<Integer> durchschnittList = new ArrayList<>();
        int i = 0;
        for (int a1 : array1) {
            for (int a2 : array2) {
                if(a1 == a2) {
                    durchschnittList.add(a1);
                    i++;
                }
            }
        }
        return durchschnittList.stream().mapToInt(it -> it).toArray();
    }
}
