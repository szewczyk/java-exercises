package pro.szewczyk.vaadin;

class BestPathFinder {

    public int solution(final int[][] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        final int N = A.length;
        final int M = A[0].length;

        int i, j;
        // sum first column
        for (i = 1; i < N; i++) {
            A[i][0] += A[i - 1][0];
        }

        // sum first row
        for (i = 1; i < M; i++) {
            A[0][i] += A[0][i - 1];
        }

        // sum inter table
        for (i = 1; i < N; i++) {
            for (j = 1; j < M; j++) {
                if (A[i - 1][j] > A[i][j - 1]) {
                    A[i][j] += A[i - 1][j];
                } else {
                    A[i][j] += A[i][j - 1];
                }
            }
        }

        return A[N - 1][M - 1];
    }
}
