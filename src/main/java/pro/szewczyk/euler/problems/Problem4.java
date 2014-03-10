package pro.szewczyk.euler.problems;

import pro.szewczyk.euler.AbstractProblem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 * 99. Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Mateusz Szewczyk
 */
public class Problem4 extends AbstractProblem<Integer> {

    /**
     * Znajdż największy polidrom który jest produtkem 3 cyfrowych liczb
     */
    @Override
    public Integer solveProblem() {
        Integer ret = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                if (isPolidrom(i * j) && (i * j) > ret) {
                    ret = i * j;
                }
            }
        }
        return ret;
    }

    protected boolean isPolidrom(final Integer number) {
        final char[] strNumber = Integer.toString(number).toCharArray();

        final int strLength = strNumber.length;

        for (int i = 0; i < strLength / 2; i++) {
            if (strNumber[i] != strNumber[strLength - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(final String[] args) {
        new Problem4().printSolution();
    }
}
