package pro.szewczyk.euler.problems;

import pro.szewczyk.euler.AbstractProblem;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 * 
 * @author Mateusz Szewczyk
 */
public class Problem9 extends AbstractProblem<Integer> {
    private static final int EVEN_SUM_NUMBER = 1000;

    @Override
    public Integer solveProblem() {

        for (int a = 1; a < EVEN_SUM_NUMBER; a++) {
            for (int b = a; b < EVEN_SUM_NUMBER; b++) {
                if (Double.compare(Math.sqrt(a * a + b * b), EVEN_SUM_NUMBER - a - b) == 0) {
                    return a * b * (EVEN_SUM_NUMBER - a - b);
                }
            }
        }
        return null;
    }

    public static void main(final String[] args) {
        new Problem9().printSolution();
    }
}
