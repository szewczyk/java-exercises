package pro.szewczyk.euler.problems;

import com.google.common.collect.Lists;
import pro.szewczyk.euler.AbstractProblem;
import pro.szewczyk.euler.ProblemPrimeFactor;

import java.util.List;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is
 * the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * @author Mateusz Szewczyk
 */
public class Problem5 extends AbstractProblem<Integer> {

    private static final int MAX_DIVIDER = 20;

    private List<Integer> primeList;

    /**
     * Znajduje najmniejszą liczbę podzielną przez liczby od 1 do {@value #MAX_DIVIDER}
     */
    @Override
    public Integer solveProblem() {
        Integer ret = MAX_DIVIDER;

        primeList = getPrimeList(MAX_DIVIDER);

        while (!isSmallestMultipe(ret)) {
            ret += MAX_DIVIDER;
        }

        return ret;
    }

    private boolean isSmallestMultipe(final int i) {
        for (final Integer prime : primeList) {
            if (i % prime != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Generate prime list lower then maxNumber
     * 
     * @param maxNumber
     *            greatest possible prime number
     * @return prime list from up to maxNumber to 2 (including)
     */
    protected List<Integer> getPrimeList(final Integer maxNumber) {
        final List<Integer> primeList = Lists.newArrayList();
        final ProblemPrimeFactor primeFactor = new ProblemPrimeFactor();

        for (int i = maxNumber; i >= 2; i--) {
            if (primeFactor.isPrime(i)) {
                primeList.add(i);
            }
        }

        return primeList;
    }

    public static void main(final String[] args) {
        new Problem5().printSolution();
    }
}
