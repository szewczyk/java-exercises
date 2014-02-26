package pro.szewczyk.vaadin;

import java.util.Arrays;
import java.util.Random;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class RandomArrayTest {
    private final void testRandom(final Integer[] integers) {
        final Integer[] testData = integers;

        final long correctSum = SumFinder.smallestSumOld(testData);

        final long newCalculatedSum = SumFinder.smallestSumNew(testData);

        MatcherAssert.assertThat(Arrays.toString(integers), Long.valueOf(correctSum),
                CoreMatchers.equalTo(Long.valueOf(newCalculatedSum)));
    }

    @Test
    public final void shouldReturnCorrectValueForRandomArray() {
        for (int i = 0; i < 10000000; i++) {
            final Integer[] integers = new Integer[new Random().nextInt(20)];
            for (int j = 0; j < integers.length; j++) {
                integers[j] = Integer.valueOf(new Random().nextInt(10));
            }
            testRandom(integers);
        }
    }
}
