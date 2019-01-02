import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class NoughtsAndCrossesTest {

    private NoughtsAndCrosses classUnderTest;
    private ByteArrayOutputStream output;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new NoughtsAndCrosses();

        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void shouldReturnAnEmptyBoardWhenIStartANewGame() {
        classUnderTest.newGame();

        String result = output.toString();

        String expected = new StringBuilder("-------\n")
                                    .append("| | | |\n")
                                    .append("-------\n")
                                    .append("| | | |\n")
                                    .append("-------\n")
                                    .append("| | | |\n")
                                    .append("-------\n")
                                    .toString();

        assertThat(result).isEqualTo(expected);
    }
}