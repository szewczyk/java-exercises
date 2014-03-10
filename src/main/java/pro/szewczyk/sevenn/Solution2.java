package pro.szewczyk.sevenn;

/**
 * Problem 2 solution
 */
public class Solution2 {
    public static void main(final String[] args) {
        final Solution2 s1 = new Solution2();
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
