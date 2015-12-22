package pro.szewczyk.java8.darkside;

public class Exceptions {
    /**
     * Inside class needs to be static for throw!
     */
    private static class TestRuntimeException extends RuntimeException {
    }

    private class TestError extends Error {
    }

    private static class TestThrowable extends Throwable {
    }

    private static class TestException extends Exception {
    }

    private interface Tester {
        default void exception() throws TestException {
            throw new TestException();
        }

        default void error() throws TestError {
            throw new TestRuntimeException();
        }

        default void runtime(String message) throws TestRuntimeException {
            throw new RuntimeException(message);
        }

        default void throwable() throws TestThrowable {
            throw new TestThrowable();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Tester tester = new Tester() {
        };
        System.out.println("start");
        try {
            System.out.println("step 1");
            tester.error();
            System.out.println("never 1");
            tester.throwable();
        } catch (Exception e) {
            try {
                System.out.println("step 2");
                tester.runtime("Override error");
                // cannot be "TestRuntimeException |" since Exceptions needs to be disjointed
            } catch (TestError | RuntimeException r) {
                System.out.println("step 3");
            } finally {
                System.out.println("step 4");
                tester.error();
            }
        } catch (Error e) {
            System.out.println("never 2");
        } catch (TestThrowable testThrowable) {
            System.out.println("never 3");
            testThrowable.printStackTrace();
        } finally {
            System.out.println("step 5");
            Thread.sleep(100);// wait for system.out flush quick fix
            tester.runtime("Final override errors!");
        }
    }
}
