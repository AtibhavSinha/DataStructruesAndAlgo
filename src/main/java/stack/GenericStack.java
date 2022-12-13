package stack;

public class GenericStack<T> {
    // Can be implemented using LL
    private Element<T> top;
    private int MAX_SIZE = 10;
    private int size = 0;

    // Example : UNDO and back button in browser, prog execution.

    public void push(T data) throws StackOverflowError{
        if(size == MAX_SIZE){
            throw new StackOverflowError();
        }
        Element newElement = new Element(data);
        newElement.setNext(top);
        top = newElement;
        size++;
    }

    public T pop() throws StackUnderflowError {
        if(size == 0){
            throw new StackUnderflowError();
        }
        T data = top.getData(); // Think
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() throws StackUnderflowError {
        if(size == 0){
            throw new StackUnderflowError();
        }
        return top.getData(); // Think

    }

    public void print() {
      Element<T> curr = top;
      while(curr != null){ // Think if .next is required?
            System.out.println(curr.getData());
            curr = curr.getNext();
      }
    }
    public boolean isEmpty() {
       return size == 0;
    }

    public boolean isFull() {
        return size == 10;
    }
}
