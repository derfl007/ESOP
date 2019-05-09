package ab04.counter;
/**
 * A counter with basic functionality.
 *
 * @author ESOP Team 2019
 *
 */
/* Aufgabe 20 a
public class Counter {

    protected int value;

    public Counter(int init) {
        this.value = init;
    }

    public void count() {
        this.value++;
    }

    public void reset() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
}
*/

public class Counter {
    protected int value;
    protected  int modulo;

    public Counter(int init, int modulo) {
        this.value = init;
        this.modulo = modulo;
    }

    public void count() {
        if(this.value == modulo -1) {
            this.reset();
        } else {
            this.value++;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
}