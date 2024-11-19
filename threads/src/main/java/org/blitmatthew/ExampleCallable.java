package org.blitmatthew;

import java.util.concurrent.Callable;

public class ExampleCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int noOfTimes = 10;
        int sum = 0;
        for (int i = 0; i < noOfTimes; i++) {
            sum += i;
            Thread.sleep(1000);
        }
        return sum;
    }
}
