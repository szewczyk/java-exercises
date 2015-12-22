package pro.szewczyk.java8.darkside;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = asList(3, 4, 5);
        System.out.println(list);
    }
}
