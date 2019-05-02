package ab04;

public class Aufgabe18 {
    public static void main(String[] args) {
        System.out.println("******  Test Fair Die");
        Die fairDie = new Die();
        int[] resultArrayFair = new int[7];
        for (int i = 0; i < 100000; i++) {
            int res = fairDie.toss();
            resultArrayFair[res]++;
        }
        printResult(resultArrayFair);
        System.out.println("******  Test Unfair Die");
        Die unFairDie = new Die(1);
        int[] resultArrayUnFair = new int[7];
        for (int i = 0; i < 100000; i++) {
            int res = unFairDie.toss();
            resultArrayUnFair[res]++;
        }
        printResult(resultArrayUnFair);
    }

    private static void printResult(int[] arr) {
        System.out.print("[");
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}

class Die {

    int value;

    public Die() {
        this.value = 0;
    }

    public Die(int value) {
        if (value >= 0 && value <= 6) {
            this.value = value;
        } else {
            this.value = 0;
        }
    }

    public int toss() {
        if (value == 0) {
            return (int) (Math.random() * 6) + 1;
        } else {
            int res = (int) (Math.random() * 7) + 1;
            return (res == 7 ? this.value : res);
        }
    }
}