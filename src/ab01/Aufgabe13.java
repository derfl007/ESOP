package ab01;

public class Aufgabe13 {
    public static void main(String[] args) {
        int kmFull = 20; //20km
        int kmDone = 4;
        int timeElapsed = 15; //minutes
        int kmLeftToMid = (kmFull / 2) - kmDone;
        int avgKmPerHour = (kmDone / timeElapsed) / 60;
        System.out.println("km bis zur Hälfte der Strecke: "+kmLeftToMid+", durchschnittliche Geschwindigkeit: "+avgKmPerHour);
    }
}
