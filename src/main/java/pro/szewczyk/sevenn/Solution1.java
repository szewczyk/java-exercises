package pro.szewczyk.sevenn;

/**
 * Problem 1 solution
 */
class Solution1 {
    public static void main(final String[] args) {

        final int[] A = new int[9];
        A[0] = 1;
        A[1] = 8;
        A[2] = -3;
        A[3] = 0;
        A[4] = 1;
        A[5] = 3;
        A[6] = -2;
        A[7] = 4;
        A[8] = 5;
        final Solution1 s = new Solution1();
        System.out.println(s.solution(6, A));
    }

    public int solution(final int K, final int[] A) {
        // write your code here...
        if (A == null || A.length == 0 || A.length > 50000) {
            return -1;
        }
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (K == (A[i] * 2l)) {
                count++;
            }
            for (int j = i + 1; j < A.length; j++) {
                if (((long) A[i] + (long) A[j]) == K) {
                    count += 2;
                }
            }
        }

        return count;
    }
}
