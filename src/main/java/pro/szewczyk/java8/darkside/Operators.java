package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class Operators {
    public static void main(String[] args) {
        testOne();

        testTwo();
    }

    private static void testTwo() {
        int a = 1;
        int b = 2;
        int x = a * b * ++b + +b * a++ + 9;
        // ((a * b) * (++b)) + ((+b) * (a++)) + 9;
        System.out.println(x);
    }

    private static void testOne() {
        int a = 0;
        int b = 0;
        int x = ++a/**++*/ > 0 ? (-a)/**++*/ : -b;
        System.out.println(x);
    }
}
