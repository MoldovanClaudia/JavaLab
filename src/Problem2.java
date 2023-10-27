public class Problem2 {
    // Aufgabe 2 - A
    // Finden Sie die maximale Zahl.
    public int minValue(int[] values) {
        for (int idx = 0; idx < values.length; idx++) {
            if (values[idx] < 0) {
                return 0;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int idx = 0; idx < values.length; idx++) {
            if (values[idx] < min) {
                min = values[idx];
            }
        }

        return min;
    }

    // Aufgabe 2 - B
    // Finden Sie die minimale Zahl.
    public int maxValue(int[] values) {
        for (int idx = 0; idx < values.length; idx++) {
            if (values[idx] < 0) {
                return 0;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int idx = 0; idx < values.length; idx++) {
            if (values[idx] > max) {
                max = values[idx];
            }
        }

        return max;
    }

    // Aufgabe 2 - C
    // Finden Sie die maximale Summe von n-1 Zahlen.
    // z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
    public int maxSum(int[] values) {
        for (int idx = 0; idx < values.length; idx++) {
            if (values[idx] < 0) {
                return 0;
            }
        }
        int minimum = minValue(values);
        int sum = 0;

        for (int idx = 0; idx < values.length; idx++) {
            sum += values[idx];
        }

        return sum - minimum;
    }

    // Aufgabe 2 - D
    // Finden Sie die minimale Summe von n-1 Zahlen.
    // z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25
    public int minSum(int[] values) {
        for (int idx = 0; idx < values.length; idx++) {
            if (values[idx] < 0) {
                return 0;
            }
        }
        int maximum = maxValue(values);
        int sum = 0;

        for (int idx = 0; idx < values.length; idx++) {
            sum += values[idx];
        }

        return sum - maximum;
    }
}
