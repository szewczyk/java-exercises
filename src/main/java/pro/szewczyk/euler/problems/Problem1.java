package pro.szewczyk.euler.problems;

import pro.szewczyk.euler.AbstractProblem;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 extends AbstractProblem<Integer> {

    @Override
    public Integer solveProblem() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(final String[] args) {
        new Problem1().printSolution();
    }
}
