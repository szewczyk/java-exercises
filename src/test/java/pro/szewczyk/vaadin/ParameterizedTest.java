package pro.szewczyk.vaadin;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import pro.szewczyk.vaadin.SumFinder;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    @Parameterized.Parameter(0)
    public List<Integer> array;

    @Parameterized.Parameters
    public static Collection<?> testData() {
        return Arrays.asList(new Object[][] {
                { Arrays.asList(new Integer[] { 1, 2, 3, 4 }) },
                { Arrays.asList(new Integer[] { 1, 2, 3, 9, 6, 4, 7 }) },
                { Arrays.asList(new Integer[] { 9, 5, 2, 1, 2, 5, 9 }) },
                { Arrays.asList(new Integer[] { 9, 1, 2, 3, 9 }) },
                { Arrays.asList(new Integer[] { 9, 3, 2, 1, 9 }) },
                { Arrays.asList(new Integer[] { 9, 3, 1, 2, 9 }) },
                { Arrays.asList(new Integer[] { 9, 5, 2, 1, 9 }) },
                { Arrays.asList(new Integer[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE }) },
                { Arrays.asList(new Integer[] { 9, 1, 1, 1, 1, 1, 9 }) },
                { Arrays.asList(new Integer[] { 9, 2, 3, 1, 3, 5, 9 }) },
                { Arrays.asList(new Integer[] { 9, 5, 2, 1, 2, 5, 9 }) } });
    }

    @Test
    public final void shouldNewCalculatorReturnValidValue() {
        final Integer[] testData = (Integer[]) array.toArray(new Integer[0]);

        final long correctSum = SumFinder.smallestSumOld(testData);

        final long newCalculatedSum = SumFinder.smallestSumNew(testData);

        MatcherAssert.assertThat(Long.valueOf(newCalculatedSum), CoreMatchers.equalTo(Long.valueOf(correctSum)));
    }
}
