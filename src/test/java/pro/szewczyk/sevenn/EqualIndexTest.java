package pro.szewczyk.sevenn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EqualIndexTest {

    @Test
    public void testLargeLongSequenceOfMinusOnes() {
        final EqualIndex engine = new EqualIndex();
        final int i = 50000 * 2 + 1;
        final int[] B = new int[i];

        for (int j = 0; j < i; j++) {
            B[j] = -1;
        }

        assertEquals(50000, engine.solution(B));
        assertEquals(engine.solutionB(B), engine.solution(B));
    }

    @Test
    public void testLargeLongSequenceOfOnes() {
        final EqualIndex engine = new EqualIndex();
        final int i = 50000 * 2 + 1;
        final int[] B = new int[i];

        for (int j = 0; j < i; j++) {
            B[j] = 1;
        }

        assertEquals(50000, engine.solution(B));
        assertEquals(engine.solutionC(B), engine.solution(B));
        assertEquals(engine.solutionB(B), engine.solution(B));
    }

    @Test
    public void testPyramide() {
        final EqualIndex engine = new EqualIndex();
        for (int i = 1; i < 5000; i++) {
            if (i % 2 == 0) {
                continue;
            }

            final int[] B = new int[i];
            for (int j = 0; j < i; j++) {
                if (i / 2 > j) {
                    B[j] = 1 + j;
                } else {
                    B[j] = i - j;
                }
            }

            assertEquals(i / 2, engine.solution(B));
            assertEquals(engine.solutionB(B), engine.solution(B));
        }
    }

    @Test
    public void testSolution() {
        final EqualIndex engine = new EqualIndex();

        final int[] A = new int[7];

        A[0] = -7;
        A[1] = 1;
        A[2] = 5;
        A[3] = 2;
        A[4] = -4;
        A[5] = 3;
        A[6] = 0;
        assertEquals(3, engine.solution(A));
        assertEquals(engine.solutionC(A), engine.solution(A));
        assertEquals(engine.solutionB(A), engine.solution(A));

        A[0] = 1;
        A[1] = 1;
        A[2] = 1;
        A[3] = 1;
        A[4] = 1;
        A[5] = 1;
        A[6] = 1;
        assertEquals(3, engine.solution(A));
        assertEquals(engine.solutionC(A), engine.solution(A));
        assertEquals(engine.solutionB(A), engine.solution(A));

        final int[] B = new int[3];
        B[0] = -2147483648;
        B[1] = 1;
        B[2] = 2147483647;
        assertEquals(2, engine.solution(B));
        assertEquals(engine.solutionC(B), engine.solution(B));
        assertEquals(engine.solutionB(B), engine.solution(B));

        final int[] C = new int[1];
        C[0] = 0;
        assertEquals(0, engine.solution(C));
        assertEquals(engine.solutionC(C), engine.solution(C));
        assertEquals(engine.solutionB(C), engine.solution(C));
    }

}
