package pro.szewczyk.java8.darkside;

/**
 * Created by BalanceIT on 2015-12-22.
 */
public class Inheritance {
    static class Vehicle {
        int price = 10;
        static int COST = 100;

        void drive() {
            System.out.println("Car is driving price[" + price + "] COST[" + COST + "] getPrice[" + getPrice() + "]");
        }

        static void sdrive() {
            System.out.println("Vehicle is driving price[-] COST[" + COST + "]");
        }

        public int getPrice() {
            return price;
        }
    }

    static class Car extends Vehicle {
        int price = 20;
        static int COST = 200;

        void drive() {
            System.out.println("Car is driving price[" + price + "] COST[" + COST + "] getPrice[" + getPrice() + "]");
            System.out.print("super: ");
            super.drive();
            System.out.println();
        }

        static void sdrive() {
            System.out.println("Car is driving price[-] COST[" + COST + "]");
            System.out.println();
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.sdrive();

        System.out.println("Vehicle section++++++++++");
        Vehicle v = car;
        v.drive();
        v.sdrive();

        car = (Car) v;
    }


    public static final class Stubborn {

    }

    // class NiceTry extends Stubborn {} -> Stubborn is final
}
