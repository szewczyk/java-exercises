import java.util.Scanner;

/**
 * Created by szewczm1 on 9/16/2015.
 */
public class Solution {
    public static void main(String[] param) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N <= 0) {
            System.out.println("ERROR");
            return;
        }
        // eat white spaces
        s.nextLine();
        int[][] tab = new int[N][];
        for (int i = 0; i < N; i++) {
            if (s.hasNextLine()) {
                final String l = s.nextLine();
                String[] ints = l.split("\\s+");
                tab[i] = new int[ints.length];
                for (int j = 0; j < ints.length; j++) {
                    tab[i][j] = Integer.parseInt(ints[j]);
                }
            } else {
                System.out.println("ERROR");
                return;
            }
        }
        if (!validDimension(tab)) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < tab.length / 2; i++) {
            rotateCircle(tab, i);
        }

        printTab(tab);
    }

    private static void rotateCircle(final int[][] tab, final int i) {
        int n = tab.length - 1;

        int topRight = tab[i][n - i];
        // top
        for (int a = 0; a + i < n - i; a++) {
            tab[i][n - a - i] = tab[i][n - a - i - 1];
        }
        // left
        for (int a = 0; a + i < n - i; a++) {
            tab[i + a][i] = tab[i + a + 1][i];
        }
        // bottom
        for (int a = 0; a + i < n - i; a++) {
            tab[n - i][i + a] = tab[n - i][i + a + 1];
        }
        // right
        for (int a = 0; a + i < n - i; a++) {
            tab[n - i - a][n - i] = tab[n - i - a - 1][n - i];
        }

        tab[i + 1][n - i] = topRight;
    }

    private static void printTab(final int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.printf("%d", tab[i][j]);
                if (tab.length - 1 != j) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean validDimension(final int[][] tab) {
        if (tab == null || tab.length == 0 || tab[0] == null || tab.length != tab[0].length) {
            return false;
        }
        for (final int[] aTab : tab) {
            if (aTab.length != tab[0].length) {
                return false;
            }
        }
        return true;
    }
}
