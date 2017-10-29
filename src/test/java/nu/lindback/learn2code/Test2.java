package nu.lindback.learn2code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2 {

    @Test
    public void testInitialValue() {
        Second object = new Second();
        assertEquals(0, object.getX());
        assertEquals(0, object.getY());
    }

    @Test
    public void testMoveUp() {
        Second object = new Second();
        object.up();
        assertEquals(0, object.getX());
        assertEquals(1, object.getY());
    }

    @Test
    public void testMoveUpTwiceRight() {
        Second object = new Second();
        object.up();
        object.up();
        object.right();
        assertEquals(1, object.getX());
        assertEquals(2, object.getY());
    }

    @Test
    public void testMoveUpTwiceRightDownLeft() {
        Second object = new Second();
        object.up();
        object.up();
        object.right();
        object.down();
        object.left();
        assertEquals(0, object.getX());
        assertEquals(1, object.getY());
    }

}
