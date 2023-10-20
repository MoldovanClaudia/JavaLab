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

}

