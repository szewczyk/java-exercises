package pro.szewczyk.vaadin;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.base.Stopwatch;

public class BestPathFinderTest {

    public int[][] testData = { { 2, 2, 4, 2 }, { 0, 3, 0, 1 }, { 1, 2, 2, 1 }, { 4, 1, 2, 2 } };

    @Test
    public final void speedTest() {
        final BestPathFinder solver = new BestPathFinder();
        final Stopwatch couter = Stopwatch.createStarted();
        final int ret = solver.solution(testData);
        final long elapse = couter.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Elapsed: " + elapse);
        assertEquals(15, ret);
    }

    public int[][] testData2 = { { 2, 2 }, { 0, 2 } };

    @Test
    public final void speedTest2() {
        final BestPathFinder solver = new BestPathFinder();
        final Stopwatch couter = Stopwatch.createStarted();
        final int ret = solver.solution(testData2);
        final long elapse = couter.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Elapsed: " + elapse);
        assertEquals(6, ret);
    }
}
