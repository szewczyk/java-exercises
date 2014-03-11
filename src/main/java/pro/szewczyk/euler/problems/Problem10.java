package pro.szewczyk.euler.problems;

import pro.szewczyk.euler.AbstractProblem;
import pro.szewczyk.euler.PrimeFactor;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author Mateusz Szewczyk
 */
public class Problem10 extends AbstractProblem<Long> {

    private static final long TWO_MILLION = 2_000_000l;

    /**
     * FIXME: use crossing out
     */
    @Override
    public Long solveProblem() {
        Long sum = 0l;
        final PrimeFactor primeFactor = new PrimeFactor();

        for (long a = 2; a < TWO_MILLION; a++) {
            if (primeFactor.isPrime(a)) {
                sum += a;
            }
        }
        return sum;
    }

    public static void main(final String[] args) {
        new Problem10().printSolution();
    }
}
