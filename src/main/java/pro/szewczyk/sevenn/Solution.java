package pro.szewczyk.sevenn;
// you can also use imports, for example:
// import java.math.*;
class Solution {
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
        final Solution s = new Solution();
        System.out.println(s.solution(6, A));
    }

    public int solution(final int K, final int[] A) {
        // write your code here...
        if (A == null || A.length == 0 || A.length > 50000) {
            return -1;
        }
        int count = 0;
        final long cmpToK = K;

        for (int i = 0; i < A.length; i++) {
            if (cmpToK == (A[i] * 2l)) {
                count++;
            }
            for (int j = i + 1; j < A.length; j++) {
                if (((long) A[i] + (long) A[j]) == cmpToK) {
                    count += 2;
                }
            }
        }

        return count;
    }
}

class Solution1 {
    public static void main(final String[] args) {
        final Solution1 s1 = new Solution1();
        for (int i = 0; i < 20000; i++) {
            if (s1.solution(i) != -1) {
                System.out.println("i: " + i + " sol: " + s1.solution(i) + " bin: " + Integer.toBinaryString(i));
            }
        }
    }

    public int solution(final int N) {
        if (N < 1) {
            return -1;
        }

        final char[] str = Integer.toBinaryString(N).toCharArray();
        boolean wasError;
        for (int i = 1; i < str.length / 2; i++) {
            wasError = false;
            for (int it = i; it < str.length; it++) {
                if (str[it] != str[it % i]) {
                    wasError = true;
                    break;
                }
            }
            if (!wasError) {
                return i;
            }
        }

        return -1;
    }

}
