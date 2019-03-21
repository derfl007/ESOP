package ab01;

import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pts = scanner.nextInt();
        String grade;
        if(pts >= 0 && pts <= 200) grade = "Nicht genügend";
        if(pts > 200 && pts <= 250) grade = "Genügend";
        if(pts > 250 && pts <= 300) grade = "Befriedigend";
        if(pts > 300 && pts <= 350) grade = "Gut";
        if(pts > 350 && pts <= 400) grade = "Sehr gut";
        else grade = "Da ist wohl etwas schief gegangen";
        System.out.println(grade);
    }
}
