package pro.szewczyk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {
    final Problem4 problemSolver = new Problem4();

    @Test
    public final void shouldFindPalindromes() {
        Assert.assertTrue(problemSolver.isPolidrom(9009));
        Assert.assertTrue(problemSolver.isPolidrom(909));
    }

    @Test
    public final void shouldntFindInvalidPalindromes() {
        Assert.assertFalse(problemSolver.isPolidrom(809));
    }
}
