package pro.szewczyk.vaadin;

public class BubbleSort {
    public static void main(final String[] args) {
        final int[] foo = {5, 2, 3, 4, 5, 1, 1, 9, 4, 1, 5, 3, 7, 4, 9, 3, 5, 7, 5};

        final int[] sortedItems = bubbleSort(foo);
        for (int i = 0; i < sortedItems.length; i++) {
            System.out.println(sortedItems[i]);
        }
    }

    private static int[] bubbleSort(final int[] A) {
        boolean wasSwap = true;
        int i;
        while (wasSwap) {
            wasSwap = false;
            for (i = 0; i < A.length; i++) {
                if (A[(i - 1)] < A[i]) {
                    final int tmp = A[(i - 1)];
                    A[(i - 1)] = A[i];
                    A[i] = tmp;
                    wasSwap = true;
                }
            }
        }
        return A;
    }
}
