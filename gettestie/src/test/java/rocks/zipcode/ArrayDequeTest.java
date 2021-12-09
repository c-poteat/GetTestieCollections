package rocks.zipcode;

import org.junit.Test;
import java.util.ArrayDeque;
import java.util.Deque;
import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {

    @Test
    public void TestArrayDequeLast() {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("first");
        queue.offer("second");

        assertEquals("second", queue.getLast());
    }

    @Test
    public void TestArrayDequeFirst() {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("third");
        queue.offer("fourth");

        assertEquals("third", queue.getFirst());
    }

    @Test
    public void TestArrayDequeRemoveFirst() {
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("fifth");
        queue.offer("sixth");

        assertEquals("fifth", queue.poll());
    }
}
