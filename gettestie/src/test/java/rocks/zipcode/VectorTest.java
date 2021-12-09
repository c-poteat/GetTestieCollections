package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

    @Test
    public void IterateThroughVectorTest() {
        Vector<String> myLittleVector = new Vector<>();
        myLittleVector.add("Hello");
        myLittleVector.add("Vector");
        String expected1 = "Hello";  // First iteration
        String expected2 = "Vector"; // Second iteration

        Iterator<String> iterator = myLittleVector.iterator();
        String actual1 = iterator.next();
        String actual2 = iterator.next();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void addVectorTest() {
        //Given
        Vector<String> myLittleVector = new Vector<>();
        String expected1 = "Hello";  //
        String expected2 = "Vector"; //
        //When
        boolean actual1 = myLittleVector.add("Hello");
        boolean actual2 = myLittleVector.add("Vector");
        //Then
        Assert.assertTrue(expected1, actual1);
        Assert.assertTrue(expected2, actual2);
    }
}
