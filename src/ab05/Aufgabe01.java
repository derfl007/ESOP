package ab05;

public class Aufgabe01 {
    public static void main(String[] args) {
        String str = "Heute muss Donnerstag sein. Mit Donnerstagen kam ich noch nie zu Rande";
        System.out.println(capitalize(str));
    }

    public static String capitalize(String text) {
        char []textArr = text.toCharArray();
        boolean replaceNext = false;
        for(int i = 0; i < textArr.length; i++) {
            if(replaceNext && Character.isLetter(textArr[i])) {
                textArr[i] = Character.toUpperCase(textArr[i]);
            }
            replaceNext = textArr[i] == ' ';

        }
        return String.valueOf(textArr);
    }
}
