package pro.szewczyk.vaadin;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BestPathFinderTest {

    public int[][] testData = { { 2, 2, 4, 2 }, { 0, 3, 0, 1 }, { 1, 2, 2, 1 }, { 4, 1, 2, 2 } };

    @Test
    public final void speedTest() {
        final BestPathFinder solver = new BestPathFinder();
        final Stopwatch counter = Stopwatch.createStarted();
        final int ret = solver.solution(testData);
        final long elapse = counter.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Elapsed: " + elapse);
        assertEquals(15, ret);
    }

    public int[][] testData2 = { { 2, 2 }, { 0, 2 } };

    @Test
    public final void speedTest2() {
        final BestPathFinder solver = new BestPathFinder();
        final Stopwatch counter = Stopwatch.createStarted();
        final int ret = solver.solution(testData2);
        final long elapse = counter.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Elapsed: " + elapse);
        assertEquals(6, ret);
    }
}
