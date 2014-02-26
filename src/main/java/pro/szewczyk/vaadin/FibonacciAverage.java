package pro.szewczyk.vaadin;

public class FibonacciAverage {
    public static void main(final String[] args) {
        System.out.println(fibonacciAverage(5));
    }

    private static double fibonacciAverage(final int N) {
        if (N <= 0) {
            return 0.0d;
        }

        long sum = 1L;

        int sum_l = 0;
        int sum_r = 1;
        int tmp;

        for (int j = 0; j < N - 1; j++) {
            tmp = sum_l;

            sum_l = sum_r;
            sum_r += tmp;
            sum += sum_r;
        }

        return sum * 1.0d / N;
    }
}
