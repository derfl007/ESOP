package ab04.clock;

import ab04.counter.Counter;

/**
 * A counter which value is bounded. When its value reaches a specified bound, the value is automatically reset to 0
 * and the count() method of its chained counter is invoked.
 *
 * @author ESOP Team 2019
 *
 */
public class ChainedCounter extends Counter {

    protected ChainedCounter next;

    public ChainedCounter(int init, int modulo, ChainedCounter next) {
        super(init, modulo);
        this.next = next;
    }

    @Override
    public void reset() {
        super.reset();
        if(next != null) next.count();
    }
}
