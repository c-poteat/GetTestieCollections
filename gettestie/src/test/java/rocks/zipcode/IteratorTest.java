package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    private List<Integer> newArrayList;
    private Iterator<Integer> iter;

    @Before
    public void setUp() {
        newArrayList = new ArrayList<Integer>();
        newArrayList.add(4);
        newArrayList.add(6);
        iter = newArrayList.iterator();
    }

    @Test
    public void testNext() {
        //Given
        iter.next();
        iter.next();

        // Test is able to iterate through and is now empty

        //Then
        Assert.assertFalse(iter.hasNext());
    }

    @Test
    public void testHasNext() {
        //Given
        newArrayList.add(8);
        iter.hasNext();

        // Test is able to iterate to next item

        //Then
        Assert.assertTrue(iter.hasNext());
    }

    @Test
    public void testRemove() {
        //Given
        iter.next();
        iter.next();
        iter.remove();

        // Test is checking if item is removed (6)

        //Then
        Assert.assertFalse(newArrayList.contains(6));
    }

}
