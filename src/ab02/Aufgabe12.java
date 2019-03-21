package ab02;

public class Aufgabe12 {
    public static void main(String[] args) {
        System.out.println("This program was started with " +
                args.length + " arguments.");
        if(args.length > 0){
            System.out.println("The provided arguments were:");
            for(int i = 0; i < args.length; i++){
                System.out.println(" - " + args[i]);
            }
        }
    }
}
