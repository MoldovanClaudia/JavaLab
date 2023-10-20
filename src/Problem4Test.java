import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem4Test {
    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    private Problem4 problem4;

    @Before
    public void init() {
        problem4 = new Problem4();
    }

    @Test
    public void Problem2Tests() {
        int[] keyboards = new int[] {40, 50, 60};
        int[] USBdrive = new int[] {8, 16};
        int budget = 60;

        int resultA = problem4.cheapestKeyboard(keyboards);
        int expectedA = 40;

        assert (resultA == expectedA);

        int resultB = problem4.mostExpensiveItem(keyboards, USBdrive);
        int expectedB = 60;

        assert (resultB == expectedB);

        int resultC = problem4.buyByBudget(USBdrive, budget);
        int expectedC = 16;

        assert (resultC == expectedC);

        int resultD = problem4.costs(keyboards, USBdrive, budget);
        int expectedD = 58;

        assert (resultD == expectedD);
    }

}
