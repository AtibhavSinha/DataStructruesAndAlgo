package queue;

import stack.GenericStack;
import stack.StackUnderflowError;

public class QueueUsingTwoStacks {

    GenericStack forwardStack = new GenericStack<Integer>();
    GenericStack reverseStack = new GenericStack<Integer>();


    public void enqueue(Integer data) throws QueueOverFlowException {
        if (isFull()){
            throw new QueueOverFlowException();
        }
        try {
            if (forwardStack.isEmpty()){
                while (!reverseStack.isEmpty()) {
                    forwardStack.push(reverseStack.pop());
                }
            }
            forwardStack.push(data);
        }
        catch (StackUnderflowError e){
            throw new QueueOverFlowException();
        }
    }

    public Integer dequeue() throws QueueUnderflowError {
        if(isEmpty()){
            throw new QueueUnderflowError();
        }

        try {
            if(reverseStack.isEmpty()) {
                while (!forwardStack.isEmpty()) {
                    reverseStack.push(forwardStack.pop());
                }
            }
            return (Integer) reverseStack.pop();
        }
        catch (StackUnderflowError e){
            throw new QueueUnderflowError();
        }
    }

    public boolean isFull() {
        return forwardStack.isFull() || reverseStack.isFull();
    }

    public boolean isEmpty() {
        return forwardStack.isEmpty() && reverseStack.isEmpty();
    }

}
