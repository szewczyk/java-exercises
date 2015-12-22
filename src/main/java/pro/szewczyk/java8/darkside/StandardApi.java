package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class StandardApi {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(4);
        // sb.insert(1, "abs"); - StringIndexOutOfBoundsException
        sb.append("test").deleteCharAt(2).delete(0,1);
        System.out.println(sb.toString());
    }
}
