package queue;

import java.lang.reflect.Array;

public class QueueElement<T> {
    // HEAD = -1 : Special value to denote empty queue: If 0 then not possible/ difficult to find empty
    // as its circular!!
    //TAIL = 0 : Start, if head == tail -> 1 element
    // ENQUEUE : move tail
    // DEQUE : HEAD will move.
    // Remove 6 elements : HEAD = 7 and TAIL = 13 (lets say its full)
    // 0 to 6 : are empty
    // Add 1 more element : TAIL will become 1
    // TAIL and HEAD can not say which is more index.. can vary based on enq and deq




    // Circular Queue using Array
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private T[] elements;

    private static  int MAX_SIZE = 40;
    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public QueueElement(Class<T> clazz) {
        // Init Generic Array
        this.elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isFull() {
        int nextIndex = (tailIndex + 1) % elements.length;
        return nextIndex == headIndex;
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

}
