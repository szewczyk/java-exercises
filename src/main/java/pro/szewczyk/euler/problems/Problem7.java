package pro.szewczyk.euler.problems;

import pro.szewczyk.euler.AbstractProblem;
import pro.szewczyk.euler.PrimeFactor;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.<br>
 * What is the 10 001st prime number?
 *
 * @author Mateusz Szewczyk
 */
public class Problem7 extends AbstractProblem<Long> {

    private static final int FINDING_PRIME_POSITION = 10_001;

    @Override
    public Long solveProblem() {
        Long prime = null;
        int primesLeftToFind = FINDING_PRIME_POSITION;

        final PrimeFactor primeFactor = new PrimeFactor();

        for (Long i = 2l; primesLeftToFind > 0; i++) {
            if (primeFactor.isPrime(i)) {
                System.out.println("prime: " + i);
                primesLeftToFind--;
                prime = i;
            }
        }

        return prime;
    }

    public static void main(final String[] args) {
        new Problem7().printSolution();
    }
}
