package nu.lindback.learn2code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test3 {
    @Test
    public void testInitialValue() {
        Third object = new Third();
        assertEquals(0, object.getX());
        assertEquals(0, object.getY());
    }

    @Test
    public void testMove() {
        Third object = new Third();
        object.move();
        assertEquals(0, object.getX());
        assertEquals(1, object.getY());
    }

    @Test
    public void testMoveRightMove() {
        Third object = new Third();
        object.move();
        object.turnRight();
        object.move();
        assertEquals(1, object.getX());
        assertEquals(1, object.getY());
    }

    @Test
    public void testMoveMoveRightMoveMoveLeftLeftMove() {
        Third object = new Third();
        object.move();
        object.move();
        object.turnRight();
        object.move();
        object.move();
        object.turnLeft();
        object.turnLeft();
        object.move();
        assertEquals(1, object.getX());
        assertEquals(2, object.getY());
    }

    @Test
    public void moveTest() {
        Third car = new Third();
        assertEquals(0, car.getX());
        assertEquals(0, car.getY());
        car.move();
        assertEquals(0, car.getX());
        assertEquals(1, car.getY());
        car.turnRight();
        car.move();
        assertEquals(1, car.getX());
        assertEquals(1, car.getY());
        car.turnRight();
        car.move();
        car.move();
        assertEquals(1, car.getX());
        assertEquals(-1, car.getY());
        car.turnLeft();
        car.move();
        assertEquals(0, car.getX());
        assertEquals(-1, car.getY());
    }
}
