package stack;

public class MinStack {

    // Approach 1: If I store a variable to keep min, then if we push or pop we need to
    // again go through n elements to find the minimum.
    // We want to know the minimum after any operation.

    GenericStack<Integer> integerGenericStack = new GenericStack<>();
    GenericStack<Integer> minStack = new GenericStack<>();

    public void push(Integer data) throws StackUnderflowError {
        int min = data;
        if(!minStack.isEmpty()) {
            if(min > minStack.peek()) {
               min = minStack.peek();
            }
        }
        integerGenericStack.push(min);
        minStack.push(min);
    }

    public Integer pop() throws StackUnderflowError {
        minStack.pop();
        return integerGenericStack.pop();
    }

    public Integer minElement() throws StackUnderflowError {
        return  minStack.peek();
    }

}
