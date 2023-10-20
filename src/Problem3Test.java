import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem3Test {
    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    private Problem3 problem3;

    @Before
    public void init() {
        problem3 = new Problem3();
    }

    @Test
    public void Problem3Tests() {
        int[] A = new int[] {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] B = new int[] {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int C = 2;

        int[] resultA = problem3.calculateSum(A, B);
        int[] expectedA = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(SHOULD_BE_EQUAL, expectedA, resultA);

//        int[] resultB = problem3.calculateDiff(A,B);
//        int[] expectedB = new int[] {};
//
//        assertArrayEquals(SHOULD_BE_EQUAL, expectedB, resultB);

        int[] resultC = problem3.multiply(A,C);
        int[] expectedC = new int[] {2, 6, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(SHOULD_BE_EQUAL, expectedC, resultC);

//        int[] resultD = problem3.division(A,C);
//        int[] expectedD = new int[] {};
//
//        assertArrayEquals(SHOULD_BE_EQUAL, expectedD, resultD);

    }

}

