package pro.szewczyk.euler;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.base.Stopwatch;

public abstract class AbstractProblem<T> implements ProblemSolver<T> {

    @Override
    @Test
    public void printSolution() {
        final Stopwatch counter = Stopwatch.createStarted();
        final T solution = solveProblem();
        counter.stop();
        System.out.println("Resolved in:");
        System.out.println(counter.elapsed(TimeUnit.MICROSECONDS) + "ms");
        System.out.println("Solution:");
        System.out.println(solution);
    }
}
