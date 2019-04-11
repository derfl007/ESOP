package ab02;

public class Aufgabe09 {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 50;
        boolean printed;
        for (int number = lowerbound; number <= upperbound; number++) {
            printed = false;  // init before processing each number
            // Print "Zap" if number is divisible by 3
            if(number % 3 == 0){
                System.out.print("Zap");
                printed = true;   // processed!
            }
            // Print "Rap" if number is divisible by 5
            if(number % 5 == 0){
                System.out.print("Rap");
                printed = true;   // processed!
            }
            // Print "tap" if number is divisible by 7
            if(number % 7 == 0){
                System.out.print("Tap");
                printed = true;   // processed!
            }
            // Print the number if it has not been processed
            if(!printed){
                System.out.print(number);
            }
            // After processing the number, print a newline if it is divisible by 10;
            // else, print a space
            if(number % 10 == 0) {
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }
        }
    }
}
