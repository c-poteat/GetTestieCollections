package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;
import java.util.PriorityQueue;
import static org.junit.Assert.assertFalse;


public class PriorityQueueTest {
    private PriorityQueue<String> newQue;

    @Before
    public void setUp() {
        this.newQue = new PriorityQueue<>();

        // Adding items to the Que using add()
        newQue.add("To");
        newQue.add("Mars");
        newQue.add("We");
        newQue.add("Go");
    }
    @Test
    public void isQueEmpty() {
        //Given
        // The Que is not empty
        assertFalse(newQue.isEmpty());
    }

    @Test
    public void addQue() {
        //Given

        //When

    }
}
