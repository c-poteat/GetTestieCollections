package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Collections;
import java.util.HashSet;
import static org.junit.Assert.assertTrue;

public class HashSetTest {
    private HashSet<Object> hashSet;

    @Before
    public void setUp() {
        this.hashSet = new HashSet<>();
    }

    @Test
    public void testIsEmptyForNewHashSet() {
        assertTrue(hashSet.isEmpty());
    }

    @Test
    public void addIsEmptyTest() {
        hashSet.add("addMe");
        hashSet.removeAll(Collections.singleton("addMe"));
        assertTrue(hashSet.isEmpty());
    }

    @Test
    public void testHashSetSize() {
        // Hash Sets can only add unique objects
        //Given
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        int expected = 3;
        //When
        int actual = hashSet.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashSetContains() {
        // Hash Sets can only add unique objects
        //Given
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        boolean expected = true;
        //When
        boolean actual = hashSet.contains(2);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
