package concatenate;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConcatenateTest {

    public ConcatenateTest() {
    }

    @Test
    public void testMain() {
        String firstWord = "Hello";
        String secondWord = "world";
        String expectedResult = "Hello world";
        Concatenate testResult = new Concatenate(firstWord, secondWord);
        assertEquals(expectedResult, testResult.concat());
    }
}
