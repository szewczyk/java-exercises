package pro.szewczyk.vaadin;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class MinDistanceFinderTest {

    public int[] demoValue = { 8, 24, 3, 20, 1, 17 };

    @Test
    public final void testSpeed() {
        final MinDistanceFinder solver = new MinDistanceFinder();
        final Stopwatch counter = Stopwatch.createStarted();
        final int ret = solver.solution(demoValue);
        final long elapse = counter.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Elapsed: " + elapse);

        assertTrue("ret: " + ret + " != 2", ret == 2);
    }
}
