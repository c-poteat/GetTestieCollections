package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class HashMapTest {
    private HashMap map;

    @Before
    public void setUp() {
        this.map = new HashMap();
    }

    @Test
    public void testIsEmptyForNewMap() {
        assertTrue(map.isEmpty());
    }

    @Test
    public void addMakesIsEmptyFalse() {
        map.put("Hello", 5);
        assertFalse(map.isEmpty());
    }

    @Test
    public void testSizeForNewMap() {
        assertEquals(0, map.size());
    }

    @Test
    public void testGetReturnsCorrectValue() {
        map.put("Hello", 5);
        assertEquals(1, map.size());

        map.put("Goodbye", 6);
        assertEquals(2, map.size());
    }
    @Test
    public void testReplacesValueWithSameKey() {
        map.put("Hello", 5);
        map.put("World", 6);

        assertEquals(5, map.get("Hello"));
    }

    @Test
    public void testRemoveDecrementSize() {
        map.put("Hello", 5);
        map.put("World", 6);

        map.remove("Hello");
        assertEquals(1, map.size());

        map.remove("World");
        assertEquals(0, map.size());

    }
}
