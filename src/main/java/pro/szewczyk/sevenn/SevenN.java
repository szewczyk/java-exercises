package pro.szewczyk.sevenn;
class Solution2 {
    public int solution(final int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int jumps = 0;
        int currIt = 0;
        int tmp;

        while (true) {
            if (currIt < 0 || currIt > A.length) {
                return jumps;
            }

            if (A[currIt] == Integer.MAX_VALUE) {
                return -1;
            }
            tmp = A[currIt];
            A[currIt] = Integer.MAX_VALUE;
            currIt += tmp;

            jumps++;
        }
    }
}
