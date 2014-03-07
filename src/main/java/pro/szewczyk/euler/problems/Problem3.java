package pro.szewczyk.euler.problems;

import pro.szewczyk.euler.AbstractProblem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 extends AbstractProblem<Long> {

    private static final Long THE_NUMBER = 600_851_475_143l;

    /**
     * Znajdujê najwiêkszy czynnik pierwszy dla liczby {@value #THE_NUMBER}
     */
    @Override
    public Long solveProblem() {
        Long leftsOver = THE_NUMBER;
        Long bigestPrimeFactor = 0l;

        if (leftsOver % 2 == 0) {
            bigestPrimeFactor = 2l;
            leftsOver = leftsOver / 2l;
            if (leftsOver < 3) {
                return bigestPrimeFactor;
            }
        }

        for (Long i = 3l; i < THE_NUMBER / 2; i += 2) {
            if (leftsOver % i == 0) {
                bigestPrimeFactor = i;
                leftsOver = leftsOver / i;
                if (leftsOver < 3) {
                    return bigestPrimeFactor;
                }
            }
        }
        return bigestPrimeFactor;
    }

    public static void main(final String[] args) {
        new Problem3().printSolution();
    }
}
