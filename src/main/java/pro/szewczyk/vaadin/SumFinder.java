package pro.szewczyk.vaadin;

public class SumFinder {
    public static void main(final String[] args) {
        final Integer[] chainTest = {1, 2, 3, 4};
        System.out.println(smallestSumNew(chainTest));

        final Integer[] chain = {1, 2, 3, 9, 6, 4, 7};
        System.out.println(smallestSumNew(chain));

        final Integer[] chainTree = {9, 5, 2, 1, 2, 5, 9};
        System.out.println(smallestSumNew(chainTree));
    }

    public static long smallestSumNew(final Integer[] array) {
        if ((array == null) || (array.length < 5)) {
            return 0L;
        }

        final Integer max = array.length - 1;

        Integer firstNumber = array[1];
        Integer firstPosition = 1;

        Integer secondNumber = Integer.MAX_VALUE;
        Integer thirdNumber = Integer.MAX_VALUE;
        Integer fourthNumber = Integer.MAX_VALUE;
        Integer secondPosition = -1;
        Integer thirdPosition = -1;
        Integer fourthPosition = -1;

        for (Integer i = 2; i < max; i++) {
            final Integer arrayValue = array[i].intValue();
            if (arrayValue < firstNumber) {
                fourthNumber = thirdNumber;
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = arrayValue;

                fourthPosition = thirdPosition;
                thirdPosition = secondPosition;
                secondPosition = firstPosition;
                firstPosition = i;
            } else if (arrayValue <= secondNumber) {
                fourthPosition = thirdPosition;
                thirdPosition = secondPosition;
                secondPosition = i;

                fourthNumber = thirdNumber;
                thirdNumber = secondNumber;
                secondNumber = arrayValue;
            } else if (arrayValue <= thirdNumber) {
                fourthPosition = thirdPosition;
                thirdPosition = i;

                fourthNumber = thirdNumber;
                thirdNumber = arrayValue;
            } else if (arrayValue <= fourthNumber) {
                fourthPosition = i;
                fourthNumber = arrayValue;
            }
        }

        if (Math.abs(firstPosition - secondPosition) > 1) {
            return firstNumber + secondNumber;
        }

        if (Math.abs(firstPosition - thirdPosition) > 1) {
            return firstNumber + thirdNumber;
        }

        if ((Math.abs(secondPosition - thirdPosition) > 1)
                && ((fourthPosition == -1) || (Math.abs(firstPosition - fourthPosition) <= 1) || (secondNumber
                + thirdNumber <= firstNumber + fourthNumber))) {
            return secondNumber + thirdNumber;
        }

        if ((fourthPosition != -1) && (Math.abs(firstPosition - fourthPosition) > 1)) {
            return firstNumber + fourthNumber;
        }

        if ((fourthPosition != -1) && (Math.abs(secondPosition - fourthPosition) > 1)) {
            return secondNumber + fourthNumber;
        }

        throw new RuntimeException("Invalid state should never happened!!");
    }

    public static long smallestSumOld(final Integer[] integers) {
        long sum = Integer.MAX_VALUE;
        if ((integers == null) || (integers.length < 5)) {
            return 0L;
        }
        final Integer max = integers.length - 1;
        for (Integer i = 1; i < max; i++) {
            for (Integer j = i + 2; j < max; j++) {
                final long tmpSum = integers[i].intValue() + integers[j].intValue();
                if (tmpSum < sum) {
                    sum = tmpSum;
                }
            }
        }
        return sum;
    }
}
