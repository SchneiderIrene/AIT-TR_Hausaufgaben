package hausaufgaben_31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    Shape[] shapes= {new Circle(3),
            new Rectangle(10, 5)};


    @Test
    @DisplayName("Test Method General Area")
    public void testGenArea() {
        double expected = Math.PI*3*3 + 10*5;
        double res = Shape.genArea(shapes);
        double delta = 0.01;

         assertEquals(expected, res, delta);
    }
}
