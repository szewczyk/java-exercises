package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a = null;
        int b[] = {};
        int c[] = {3};
        int[] d[] = {{3}};
        /** [] */int e[] = null;
        int[] f[] = {new int[]{3}};
        a = new int[2];
        /**a = new [2] int;*/
        a = new int[]{2, 3};
        a = new int[]{};
        /**a = new int[1]{2};*/

        System.out.println(new int[]{3, 4}); // -> [I@6e0be858
        System.out.println(/**{3,4}*/);
    }
}
