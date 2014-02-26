package pro.szewczyk.sevenn;
import java.math.BigDecimal;

public class EqualIndex {
    public int solution(final int[] A) {
        if (A == null) {
            return -1;
        }

        BigDecimal lsum = BigDecimal.ZERO;
        BigDecimal rsum = BigDecimal.ZERO;

        // suma wszystkich
        for (final int a : A) {
            rsum = rsum.add(BigDecimal.valueOf(a));
        }

        int i = 0;
        for (final int a : A) {
            final BigDecimal aBig = BigDecimal.valueOf(a);
            rsum = rsum.subtract(aBig);
            if (lsum.compareTo(rsum) == 0) {
                return i;
            }
            lsum = lsum.add(aBig);
            i++;
        }
        return -1;
    }

    public int solutionB(final int[] arr) {
        final int n = arr.length;
        if (n == 0) {
            return -1;
        }
        long sum = 0;
        int i;
        for (i = 0; i < n; i++) {
            sum += (long) arr[i];
        }

        long sum_left = 0;
        for (i = 0; i < n; i++) {
            final long sum_right = sum - sum_left - (long) arr[i];
            if (sum_left == sum_right) {
                return i;
            }
            sum_left += (long) arr[i];
        }
        return -1;
    }

    public int solutionC(final int[] A) {
        BigDecimal sum = new BigDecimal(0);
        BigDecimal leftSum = new BigDecimal(0);

        for (int i = 0; i < A.length; i++) {
            leftSum = leftSum.add(new BigDecimal(A[i]));
        }
        for (int i = 0; i < A.length; i++) {
            if (sum.compareTo(leftSum.add(new BigDecimal(-A[i]))) == 0) {
                return i;
            }
            sum = sum.add(new BigDecimal(A[i]));
            leftSum = leftSum.add(new BigDecimal(-A[i]));
        }
        return -1;
    }
}
