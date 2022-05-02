package jpat.task_3_1;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                nextIndex++;
                int randomInt = random.nextInt((max - min) + 1) + min;
                return randomInt;
            }
        };
    }
}
