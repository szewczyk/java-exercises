import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by szewczm1 on 9/16/2015.
 */
public class SolutionTaskOne {
    public static void main(String[] param) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N < 0) {
            throw new IllegalArgumentException();
        }
        // eat white spaces
        s.nextLine();
        int[][] tab = new int[N][];
        for (int i = 0; i < N; i++) {
            final String l = s.nextLine();
            String[] ints = l.split("\\s+");
            tab[i] = new int[ints.length];
            for (int j = 0; j < ints.length; j++) {
                tab[i][j] = Integer.parseInt(ints[j]);
            }
        }

        int k = s.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (hasDuplicate(tab, i, j, k, N)) {
                    System.out.print("YES");
                    return;
                }
            }
        }

        System.out.print("NO");
    }

    private static boolean hasDuplicate(final int[][] tab, final int i, final int j, final int k, final int n) {
        final Set<Integer> s = new HashSet<>();
        for (int a = i; a < i + k && a < n; a++) {
            for (int b = j; b < j + k && b < tab[i].length; b++) {
                if (!s.add(tab[a][b])) {
                    return true;
                }
            }
        }
        return false;
    }
}
