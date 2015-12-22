package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class InitializeSequence extends AbstractInitializer {
    {
        System.out.print("block init 1 ");
        System.out.println("test: undefined, TEST: " + TEST);
    }

    static {
        System.out.print("static init -1 ");
        System.out.println("test: undefined, TEST: undefined");
    }

    private int test = 1;
    private static int TEST = -1;

    public static void main(String[] args) {
        System.out.println("main 1");
        new InitializeSequence();
    }

    {
        System.out.print("block init 2 ");
        test = 2;
        System.out.println("test: " + test + ", TEST: " + TEST);
    }

    static {
        System.out.print("static init -2 ");
        TEST = -2;
        System.out.println("test: undefined, TEST: " + TEST);
    }

    public InitializeSequence() {
        System.out.print("constructor init 2 ");
        test = 6;
        System.out.println("test: " + test + ", TEST: " + TEST);
    }

    {
        System.out.print("block init 3 ");
        test = 3;
        System.out.println("test: " + test + ", TEST: " + TEST);
    }

    static {
        System.out.print("static init -3 ");
        TEST = -3;
        System.out.println("test: undefined, TEST: " + TEST);
    }
}

abstract class AbstractInitializer {
    {
        System.out.println("abstract block 1");
    }

    static {
        System.out.println("abstract static block 1");
    }

    public AbstractInitializer() {
        System.out.println("abstract constructor");
    }

    {
        System.out.println("abstract block 2");
    }

    static {
        System.out.println("abstract static block 2");
    }
};

// Interface does not allows the blocs
// interface StaticTestFails {
//    static: {
//        System.out.println("interTest");
//    }
//}