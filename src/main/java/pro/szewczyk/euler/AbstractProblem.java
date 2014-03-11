package pro.szewczyk.euler;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public abstract class AbstractProblem<T> implements ProblemSolver<T> {

    @Override
    public void printSolution() {
        final Stopwatch counter = Stopwatch.createStarted();
        final T solution = solveProblem();
        counter.stop();
        System.out.println("Resolved in:");
        System.out.println(counter.elapsed(TimeUnit.MICROSECONDS) + " micro seconds");
        System.out.println("Solution:");
        System.out.println(solution);
    }
}
