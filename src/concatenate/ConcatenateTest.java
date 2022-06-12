/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Concatenate concatenate = new Concatenate();
        String testResult = concatenate.Concatenate(firstWord, secondWord);
        assertEquals(expectedResult, testResult);
        assertEquals(1, 1);
    }
}
