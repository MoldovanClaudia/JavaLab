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

    @Test
    public void cheapestKeyboard_uexpected() {
        Problem4 problem4 = new Problem4();
        int[] keyboardPrice = new int[]{40, -35, 70, 15, 45};
        int result = problem4.cheapestKeyboard(keyboardPrice);
        assert result == 0 : "Test failed";
    }

    @Test
    public void mostExpensiveItem_unexpected() {
        Problem4 problem4 = new Problem4();
        int[] keyboardPrice = new int[]{40, 35, -70, 15, 45};
        int[] USBprice = new int[]{20, -15, 40, 15};
        int result = problem4.mostExpensiveItem(keyboardPrice, USBprice);
        assert result == 0 : "Test failed";

    }

//    @Test
//    public void buyByBudget_unexpected() {
//        Problem4 problem4 = new Problem4();
//        int[] USBprice = new int[]{21, 13, 40, 11, 65};
//        int budget = 10;
//        int result = problem4.buyByBudget(USBprice, budget);
//        assert result == 0 : "Test failed";
//    }

    @Test
    public void costs_unexpected() {
        Problem4 problem4 = new Problem4();
        int[] keyboardPrice = new int[]{40, 50, 60};
        int[] USBprice = new int[]{8, 12};
        int budget = 20;
        int result = problem4.costs(keyboardPrice, USBprice, budget);
        assert result == -1 : "Test failed";
}




}
