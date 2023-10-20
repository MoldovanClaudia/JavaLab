public class Problem3 {
    // Aufgabe 3 - A
    // Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
    // z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]

    public int[] calculateSum(int[] A, int[] B) {
        int[] finalSum = new int[A.length];
        int flag = 0;

        for (int idx = A.length - 1; idx >= 0; idx--) {
            int sum = A[idx] + B[idx] + flag;
            finalSum[idx] = sum % 10;
            flag = sum / 10;
        }

        if (flag > 0) {
            int[] finalResult = new int[A.length + 1];
            finalResult[0] = flag;
            for (int idx = 1; idx < finalResult.length; idx++) {
                finalResult[idx] = finalSum[idx - 1];
            }
            return finalResult;
        } else {
            return finalSum;
        }
    }

    // Aufgabe 3 - C
    // Berechnen Sie die Multiplikation. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
    // z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
    public int[] multiply(int[] valueToBeMultiplied, int valueToMultiplyWith) {
        int carry = 0;
        int[] result = new int[valueToBeMultiplied.length];

        for (int idx = valueToBeMultiplied.length - 1; idx >= 0; idx--) {
            int multipliction = valueToBeMultiplied[idx] * valueToMultiplyWith + carry;
            result[idx] = multipliction % 10;
            carry = multipliction / 10;
        }

        if (carry > 0) {
            int[] finalResult = new int[valueToBeMultiplied.length + 1];
            finalResult[0] = carry;
            for (int idx = 1; idx < finalResult.length; idx++) {
                finalResult[idx] = result[idx - 1];
            }
            return finalResult;
        } else {
            return result;
        }
    }

    // Aufgabe 3 - B
    // Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern.
    // z.B. [8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]


    public int[] calculateDiff(int[] A, int[] B) {
        int[] difference = new int[A.length];
        int carry = 0;
        int digit_difference;

        int index = 0;
        int ct = 0;
        while (A[index] == B[index]) {
            index++;
            ct++;
        }

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[ct] > B[ct]) {
                digit_difference = A[i] - B[i] - carry;
            } else
                digit_difference = B[i] - A[i] - carry;
            if (digit_difference < 0) {
                digit_difference += 10;
                carry = 1;
            } else
                carry = 0;
            difference[i] = digit_difference;
        }

        return difference;
    }



    // Aufgabe 3 - D
    // Berechnen Sie die ganzzahlige Division. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
    // z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]
    public int[] division(int[] num, int number){
        int borrow=0;
        int n = num.length;
        int[] result= new int[n];

        for( int i=0; i<n; i++){
            int division= borrow * 10 + num[i];
            result[i] = division /number;
            borrow = division % number;
        }
        return result;

    }

}
