package pro.szewczyk.vaadin;

import java.util.Arrays;

class MinDistanceFinder {
    public int solution(final int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }
        int minDist = Integer.MAX_VALUE;
        int tmp;

        Arrays.sort(A);

        for (int i = 1; i < A.length; i++) {
            tmp = Math.abs(A[i - 1] - A[i]);
            if (tmp < minDist) {
                minDist = tmp;
                if (tmp == 0) {
                    return 0;
                }
            }
        }

        return minDist;
    }
}
