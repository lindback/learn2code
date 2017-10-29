package nu.lindback;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveTest {
    @Test
    public void moveTest(){
        Move move = new Move();
        assertEquals(0, move.getX());
        assertEquals(0, move.getY());
        move.up();
        assertEquals(0, move.getX());
        assertEquals(1, move.getY());
        move.right();
        move.right();
        assertEquals(2, move.getX());
        assertEquals(1, move.getY());
        move.down();
        move.down();
        move.left();
        assertEquals(1, move.getX());
        assertEquals(-1, move.getY());
    }
}
