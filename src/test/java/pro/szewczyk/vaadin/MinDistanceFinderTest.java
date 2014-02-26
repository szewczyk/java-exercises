package pro.szewczyk.vaadin;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.base.Stopwatch;

public class MinDistanceFinderTest {

    public int[] demoValue = { 8, 24, 3, 20, 1, 17 };

    @Test
    public final void testSpeed() {
        final MinDistanceFinder solver = new MinDistanceFinder();
        final Stopwatch couter = Stopwatch.createStarted();
        final int ret = solver.solution(demoValue);
        final long elapse = couter.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Elapsed: " + elapse);

        assertTrue("ret: " + ret + " != 2", ret == 2);
    }
}
