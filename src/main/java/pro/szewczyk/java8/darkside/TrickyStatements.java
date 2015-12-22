package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-11-20.
 */
public class TrickyStatements {
    public static void main(String[] args) {
        regularFor();

        labeledIf();

        emptyBlock();

        labeledDoWhile();

        emptyStatement();

        String sinceJava8 = stringSwitch();

        emptySwitch(sinceJava8);

        emptyDefaultSwitch(sinceJava8);

        labeledEmptyFor();
    }

    private static void regularFor() {
        int count = 0;
        row:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                if (i * j % 2 == 0) continue row;
                count++;
            }
        }
        System.out.println(count);
    }

    private static void labeledEmptyFor() {
        loop:
        for (; ; ) ;
    }

    private static void emptyDefaultSwitch(String sinceJava8) {
        switch (sinceJava8) {
            default:
        }
    }

    private static void emptySwitch(String sinceJava8) {
        switch (sinceJava8) {

        }
    }

    private static String stringSwitch() {
        String sinceJava8 = "";
        switch (sinceJava8) {
            case "a":
        }
        return sinceJava8;
    }

    private static void emptyStatement() {
        ;
    }

    private static void labeledDoWhile() {
        For:
        do
            ;
        while (false);
    }

    private static void emptyBlock() {
        empty:
        {
            ;
            ;
            ;
            ;
            ;
        }
    }

    private static void labeledIf() {
        test:
        if (true)
            ;
    }
}
