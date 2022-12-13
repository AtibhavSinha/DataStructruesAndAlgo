package data;

public class LinkedList<T extends Comparable<T>> {
    private Node<T> head = null;

    public LinkedList(){
    }

    public int countNodes() {
        Node<T> current = head; // Missed to think
        if(head == null) {
            return 0;
        }
        else {
            int count = 0;
            while(current != null){
                current = current.getNext();
                count++;
            }
            return count;
        }
    }

    public void addNode(T data) {
        //Node<T> current = head;
        // Think if we need a separate pointer curr or not !!
        if(head == null ) {
            Node newNode = new Node<T>(data);
            head = newNode;
        }
        else {
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            Node newNode = new Node<T>(data);
            current.setNext(newNode);
        }
    }
}
