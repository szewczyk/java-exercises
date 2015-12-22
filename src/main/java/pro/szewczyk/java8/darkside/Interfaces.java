package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class Interfaces {
    public abstract interface Readable {
        public static final int READ_SPEED = 1;

        default public boolean canRead() {
            return true;
        }

        public abstract void read(String msg);
    }

    interface Writable {
        int WRITE_SPEED = 2;

        default boolean canWrite() {
            return true;
        }

        public abstract void write();
    }

    interface Contactable {
        default boolean canWrite() {
            return false;
        }

        default public boolean canRead() {
            return false;
        }
    }

    public static final class Printer implements Writable {
        @Override
        public void write() {
            System.out.println("printing....");
        }
    }

    public static final class Scanner implements Readable {
        @Override
        public void read(String msg) {
            System.out.println("Reading: " + msg);
        }
    }

    interface ExtendedInterface extends Writable, Readable/**, Contactable*/
    {

    }

    public static final class AllInOne implements Writable, Readable /**, Contactable*/
    {
        @Override
        public void read(String msg) {

        }

        @Override
        public void write() {

        }
    }

    public static final class AllInOneWithResolvedConflicts implements Writable, Readable, Contactable {
        @Override
        public void read(String msg) {

        }

        @Override
        public void write() {

        }

        public boolean canWrite() {
            return false;
        }

        public boolean canRead() {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
