package hausaufgaben_31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    @DisplayName("2 Shapes")
    public void testGenArea() {
        Shape[] shapes= {new Circle(3), new Rectangle(10, 5)};
        double expected = Math.PI*3*3 + 10*5;
        double res = Main.genArea(shapes);

        double delta = 0.01;

         assertEquals(expected, res, delta);
    }

    @Test
    @DisplayName("Zero Shape")
    public void testZeroGenArea() {
        Shape [] shapes = {};
        double expected = 0;
        double res = Main.genArea(shapes);

        double delta = 0.01;

        assertEquals(expected, res, delta);
    }

    @Test
    @DisplayName("1 Shape")
    public void testOneGenArea() {
        Shape [] shapes = {new Circle(3)};
        double expected = Math.PI*3*3;
        double res = Main.genArea(shapes);

        double delta = 0.01;

        assertEquals(expected, res, delta);
    }
}
