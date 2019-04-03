package ab03;

import java.util.ArrayList;
import java.util.List;

import static ab03.Aufgabe6.teilt;

public class Aufgabe10 {
    public static void main(String[] args) {
        int i = 1;
        int n = 0;
        while(n < 4) {
            int divSum = getRealDivs(i).stream().mapToInt(Integer::intValue).sum();
            if(i == divSum) {
                System.out.println(i);
                n++;
            }
            i++;
        }
    }

    private static List<Integer> getRealDivs(int p0) {
        List<Integer> divs = new ArrayList<>();
        for(int i = 1; i < p0; i++) {
            if(teilt(p0, i)) divs.add(i);
        }
        return divs;
    }
}
