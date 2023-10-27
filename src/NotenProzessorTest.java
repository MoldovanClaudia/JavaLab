import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NotenProzessorTest {

    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    private NotenProzessor notenProzessor;

    @Before
    public void init() {
        notenProzessor = new NotenProzessor();
    }

    @Test
    public void NotenProzessorTests() {
        int[] noten = new int[] { 10, 20, 30, 48, 50, 67, 80, 99, 100};

        int[] resultA = notenProzessor.nichtAusreichendeNoten(noten);
        int[] expectedA = new int[] { 10, 20, 30};
        int[] unexpectedA = new int[] { 48, 50};

        assertArrayEquals(SHOULD_BE_EQUAL, expectedA, resultA);

        int resultB = notenProzessor.meanGrade(noten);
        int expectedB = 56;

        assert(expectedB == resultB);

        int[] resultC = notenProzessor.roundedGrades(noten);
        int[] expectedC = new int[] { 10, 20, 30, 50, 50, 67, 80, 100, 100};

        assertArrayEquals(SHOULD_BE_EQUAL, expectedC, resultC);

        int resultD = notenProzessor.maxGrade(noten);
        int expectedD = 100;

        assert(expectedD == resultD);
    }

    @Test
    public void nichtAusreichendeNotenTest_unexpected() {
        NotenProzessor problem1 = new NotenProzessor();
        int[] noten = new int[]{12, 27, 45, 89, -66, 100, 73, 92, -34, 22};
        int[] result = problem1.nichtAusreichendeNoten(noten);
        assert result == null : "Test failed";

    }

    @Test
    public void meanGradeTest_unexpected() {
        NotenProzessor problem1 = new NotenProzessor();
        int[] grades = new int[]{12, 27, 45, 89, -66, 100, 73, 92, 34, -22};
        int result = problem1.meanGrade(grades);
        assert result == 0 : "Test failed";
    }

    @Test
    public void roundedGradeTest_unexpected() {
        NotenProzessor problem1 = new NotenProzessor();
        int[] grades = new int[]{12, 27, 45, -89, 66, 100, 73, 92, -34, 22};
        int[] result = problem1.roundedGrades(grades);
        assert result == null : "Test failed";
    }

    @Test
    public void maximaleAbgerundeteNotenTest_unexpected() {
        NotenProzessor problem1 = new NotenProzessor();
        int[] grades = new int[]{12, 27, 45, 89, 66, -100, 73, 92, 34, -22};
        int result = problem1.maxRoundedGrade(grades);
        assert result == 0 : "Test failed";
}







}

