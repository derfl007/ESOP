package ab02;

public class Aufgabe32 {
    public static void main(String[] args) {
        int[] days = new int[365];
        for(int i = 0; i < days.length; i++) {
            days[i] = i+1;
            System.out.println((i+1) + " days " + ((i == 0) ? " has " : " have ") + ((i+1)*24) + " hours");
        }
    }
}