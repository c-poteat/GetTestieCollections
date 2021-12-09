package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.TreeMap;

public class TreeMapTest {


    @Test
    public void checkTreeMapOrderNaturally() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "val");
        treeMap.put(2, "val");
        treeMap.put(1, "val");
        treeMap.put(5, "val");
        treeMap.put(4, "val");

        Assert.assertEquals("[1, 2, 3, 4, 5]", treeMap.keySet().toString());
        // Prints natural order
    }

    @Test
    public void checkTreeMapOrderNaturally2() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("d", "val");
        treeMap.put("e", "val");
        treeMap.put("c", "val");
        treeMap.put("b", "val");
        treeMap.put("a", "val");

        Assert.assertEquals("[a, b, c, d, e]", treeMap.keySet().toString());
        // Prints natural order
    }
}
