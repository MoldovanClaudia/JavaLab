import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem2Test {
    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    private Problem2 problem2;

    @Before
    public void init() {
        problem2 = new Problem2();
    }

     @Test
    public void Problem2Tests() {
        int[] values = new int[] { 4, 8, 3, 10, 17};

        int resultA = problem2.maxValue(values);
        int expectedA = 17;

        assert (resultA == expectedA);

        int resultB = problem2.minValue(values);
        int expectedB = 3;

        assert (resultB == expectedB);

        int resultC = problem2.maxSum(values);
        int expectedC = 39;

        assert (resultC == expectedC);

        int resultD = problem2.minSum(values);
        int expectedD = 25;

        assert (resultD == expectedD);

     }

    @Test
    public void maxValue_unexpected() {
        Problem2 problem2 = new Problem2();
        int[] values = new int[]{4, 8, 3, 10, -17};
        int result = problem2.maxValue(values);
        assert result == 0 : "Test failed";
    }

    @Test
    public void minValue_unexpected() {
        Problem2 problem2 = new Problem2();
        int[] values = new int[]{4, 8, 3, -10, 17};
        int result = problem2.minValue(values);
        assert result == 0 : "Test failed";
    }

    @Test
    public void maxSum_unexpected() {
        Problem2 problem2 = new Problem2();
        int[] values = new int[]{4, 8, -3, 10, 17};
        int result = problem2.maxSum(values);
        assert result == 0 : "Test failed";
    }

    @Test
    public void minSum_unexpected() {
        Problem2 problem2 = new Problem2();
        int[] values = new int[]{4, -8, 3, 10, 17};
        int result = problem2.minSum(values);
        assert result == 0 : "Test failed";
    }





}
