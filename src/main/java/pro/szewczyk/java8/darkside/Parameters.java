package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public interface Parameters {
    void f1();

    void f2();

    void f3(int a);

    void f4(Integer a);

    void f5(int[] a);

    void f6(int a[]);

    void f7(int a[]/**, [] int a*/);

    void f8(int... a);

    void f9(int[] a, int... b);

    void f9(int /**...*/a, int... b);

    void f10(/**...*/int b/**...*/);
}
