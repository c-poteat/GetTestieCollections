package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.Stack;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world Push");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world Pop");
        stack.pop();
        assertEquals(true, stack.isEmpty()); // true
        // Stack is empty since item was removed
    }


    @Test
    public void TestStackPeek() {
        Stack<Integer> stack = new Stack<>();
        int expected = stack.push(3);
        int actual = stack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestStackisEmpty() {
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }
}
