package hausaufgaben_41;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class MainTest {
    @Test
    public void test_findToNumberOccurrence_2(){
        List<String>actuel = new ArrayList<>();
        actuel.add("John");
        actuel.add("Mary");
        actuel.add("Peter");
        actuel.add("John");
        assertEquals(2, Main.findNameOccurrence(actuel, "John"));
    }

    @Test
    public void test_findToNumberOccurrence_0(){
        List<String>actuel = new ArrayList<>();
        actuel.add("John");
        actuel.add("Mary");
        actuel.add("Peter");
        actuel.add("John");
        assertEquals(0, Main.findNameOccurrence(actuel, "Evgeniy"));
    }

    @Test
    public void test_findToNumberOccurrence_empty(){
        List<String>actuel = new ArrayList<>();

        assertEquals(0, Main.findNameOccurrence(actuel, "John"));
    }

}