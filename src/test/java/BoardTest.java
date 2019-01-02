import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BoardTest {

    private Board classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Board();
    }

    @Test
    public void shouldSetFifthCellToCross() {
        classUnderTest.setCell(Board.Input.CROSS, 5);

        assertArrayEquals(classUnderTest.getBoard(), new Board.Input[][] {
                {Board.Input.EMPTY, Board.Input.EMPTY, Board.Input.EMPTY},
                {Board.Input.EMPTY, Board.Input.EMPTY, Board.Input.CROSS},
                {Board.Input.EMPTY, Board.Input.EMPTY, Board.Input.EMPTY},
        });
    }
}
