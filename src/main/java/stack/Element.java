package stack;

public class Element<T> {
    private T data;
    private Element next;

    public Element(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
