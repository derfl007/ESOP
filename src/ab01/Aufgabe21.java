package ab01;

import java.util.Scanner;

public class Aufgabe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekDay = scanner.nextInt();
        String weekDayStr = "";
        switch (weekDay) {
            case 1:
                weekDayStr = "Montag";
            case 2:
                weekDayStr = "Dienstag";
            case 3:
                weekDayStr = "Mittwoch";
            case 4:
                weekDayStr = "Donnerstag";
            case 5:
                weekDayStr = "Freitag";
            case 6:
                weekDayStr = "Samstag";
            case 7:
                weekDayStr = "Sonntag";
            default:
                weekDayStr = "Bitte eine Zahl von 1-7 eingeben.";
        }
        System.out.println(weekDayStr);
    }
}
