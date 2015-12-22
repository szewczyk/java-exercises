package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-10-20.
 */
public class OCA {
    private String color;

    public OCA() {
        this("white");
    }

    public OCA(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        OCA e = new OCA();
        System.out.println("Color: " + e.color);
    }
}