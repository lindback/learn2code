package nu.lindback.learn2code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Test1 {

    @Test
    public void testInitialValue() {
        First object = new First();
        assertEquals(0, object.val);
    }

    @Test
    public void testInitialIncreaseOnce() {
        First object = new First();
        object.increase();
        assertEquals(1, object.val);
    }

    @Test
    public void testInitialIncreaseTwice() {
        First object = new First();
        object.increase();
        object.increase();
        assertEquals(2, object.val);
    }

    @Test
    public void testInitialIncreaseTwiceDecreaseOnce() {
        First object = new First();
        object.increase();
        object.increase();
        object.decrease();
        assertEquals(1, object.val);
    }


}
