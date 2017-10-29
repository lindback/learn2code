package nu.lindback;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveCar {
    @Test
    public void moveTest(){
        Car car = new Car();
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
