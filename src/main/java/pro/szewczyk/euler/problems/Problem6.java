package pro.szewczyk.euler.problems;

import java.math.BigInteger;

import pro.szewczyk.euler.AbstractProblem;

/**
 * The sum of the squares of the first ten natural numbers is, <br>
 * 1^2 + 2^2 + ... + 10^2 = 385<br>
 * The square of the sum of the first ten natural numbers is,<br>
 * (1 + 2 + ... + 10)^2 = 552 = 3025<br>
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.<br>
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author Mateusz Szewczyk
 */
public class Problem6 extends AbstractProblem<BigInteger> {

    private static final int FIRST_NUMBERS = 100;

    /**
     * Znajduje różnicę sumy liczb do kwadratu od sumy kwadratów liczb
     * 
     * @deprecated ugly resolution
     */
    @Override
    @Deprecated
    public BigInteger solveProblem() {
        return getSumOfNumbersToSquare(FIRST_NUMBERS).subtract(getSumOfSquarsFromNumber(FIRST_NUMBERS));
    }

    private BigInteger getSumOfSquarsFromNumber(final int firstNumbers) {
        BigInteger ret = BigInteger.ZERO;

        for (int i = 1; i <= firstNumbers; i++) {
            final BigInteger square = new BigInteger(Integer.toString(i * i));

            ret = ret.add(square);
        }
        return ret;
    }

    private BigInteger getSumOfNumbersToSquare(final int firstNumbers) {
        int sum = 0;

        for (int i = 1; i <= firstNumbers; i++) {
            sum += i;
        }

        return new BigInteger(Integer.toString(sum)).pow(2);
    }

    public static void main(final String[] args) {
        new Problem6().printSolution();
    }
}
