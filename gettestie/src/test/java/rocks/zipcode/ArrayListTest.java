package rocks.zipcode;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ArrayListTest {


    @Test
    public void TestArrayListIsEmpty() {
        ArrayList<Object> emptyArray = new ArrayList<>();

        assertTrue(emptyArray.isEmpty());
    }
    @Test
    public void TestArrayListGetElement() {
        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("This");
        strArray.add("is");
        strArray.add("a");
        strArray.add("Test");

        String element = strArray.get(0);
        assertEquals("This", element);
    }

    @Test
    public void TestArrayRemove() {
        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("This");
        strArray.remove(0);

        assertTrue(strArray.isEmpty());
    }


}
