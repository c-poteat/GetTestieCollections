package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void addElementToTreeSetTest() {
        Set<String> treeSet = new TreeSet<>();

        Assert.assertTrue(treeSet.add("New String"));
    }

    @Test
    public void isTreeSetEmptyTest() {
        Set<String> treeSet = new TreeSet<>();
        //Newly created treeset is empty
        Assert.assertTrue(treeSet.isEmpty());
    }

    @Test
    public void containsElementTest() {
        Set<Integer> containsElement = new TreeSet<>();
        containsElement.add(5);

        Assert.assertTrue(containsElement.contains(5));
    }

    @Test
    public void removeElementTest() {
        Set<Integer> removeFromTree = new TreeSet<>();
        removeFromTree.add(5);

        Assert.assertTrue(removeFromTree.remove(5));
    }

    @Test
    public void clearTreeSetTest() {
        Set<String> isNowEmpty = new TreeSet<>();
        isNowEmpty.add("Hello");
        isNowEmpty.add("World");
        isNowEmpty.clear();

        Assert.assertTrue(isNowEmpty.isEmpty());
    }

    @Test
    public void treeSetSizeTest() {
        //Given
        Set<String> whatIsMySize = new TreeSet<>();
        whatIsMySize.add("Hello");
        whatIsMySize.add("World");
        int expected = 2;

        // When
        int actual = whatIsMySize.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treegetFirst() {
        //Given
        Set<String> amIFirst = new TreeSet<>();
        String expected = "Hello";

        // When
        boolean actual = amIFirst.add("Hello");

        // Then
        Assert.assertTrue(expected, actual);

    }
}
