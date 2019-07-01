package ab05;

public class Aufgabe07 {
    public static int stringToInt(String s) throws NumberFormatException  { //3.
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("Das war keine Zahl"); //1.
            e.printStackTrace(); //2.
        }
        return 0;
    }
}
