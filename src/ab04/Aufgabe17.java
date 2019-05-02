package ab04;

public class Aufgabe17 {
    public static void main(String[] args) {
        long result = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            result += i;
            if (i % 100000000 == 0) {
                System.out.println("i=" + i);
            }
        }
        System.out.println("result=" + result);
    }
}

class StopWatch {

    double startTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public double stop() {
        return System.currentTimeMillis() - startTime;
    }
}
