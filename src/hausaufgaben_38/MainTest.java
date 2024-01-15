package hausaufgaben_38;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    @BeforeEach
    public void setUp() {

        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }
    @Test
    public void test_yes_no_0El() {

        List<String>expected = List.of();
        assertEquals(expected, Main.yes_no(List.of(),List.of()));
    }
    @Test
    public void test_yes_no_2El() {

        list1 = List.of(1, 2);
        list2 = List.of(0, 2);

        List<String>expected = List.of("no", "yes");
        assertEquals(expected, Main.yes_no(list1, list2));
    }
    @Test
    public void test_yes_no_4El() {

        list1 = List.of(1, 2, 3, 4);
        list2 = List.of(0, 2, 3, 0);

        List<String>expected = List.of("no", "yes", "yes", "no");
        assertEquals(expected, Main.yes_no(list1, list2));
    }

    @Test
    public void test_yes_no_10El() {

        list1 = List.of(1, 2, 3, 4,5,6,7,8,9,10);
        list2 = List.of(0, 2, 3, 0, 5,6,7,8,9,10);

        List<String>expected = List.of("no", "yes", "yes", "no", "yes", "yes", "yes", "yes", "yes", "yes");
        assertEquals(expected, Main.yes_no(list1, list2));
    }

}