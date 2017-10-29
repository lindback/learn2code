package nu.lindback;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SimpleTest {

    @Test
    public void testIncreaseVariable(){
        Simple simple = new Simple();
        assertEquals(0, simple.counter());
        assertEquals(2, simple.counter());
        assertEquals(4, simple.counter());
        assertEquals(4, simple.counter());
        assertEquals(6, simple.counter());
        assertEquals(8, simple.counter());
        assertEquals(10, simple.counter());


        Simple newSimple = new Simple();
        assertEquals(0, newSimple.counter());
        assertEquals(2, newSimple.counter());

    }

}
