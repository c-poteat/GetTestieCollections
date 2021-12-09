package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void testEmptyLinkedList() {
        //Given
        LinkedList<String> newLinky = new LinkedList();

        //Then
        Assert.assertTrue(newLinky.isEmpty());
        Assert.assertEquals(0, 0);
    }

    @Test
    public void testpeekLinkedList() {
        //Given
        LinkedList newLinky = new LinkedList();
        newLinky.add(1);
        newLinky.add("ToMany");
        Object expected = "ToMany";
        //When
        Object actual = newLinky.peekLast();
        //Then
        Assert.assertEquals(expected,actual);
    }
}
