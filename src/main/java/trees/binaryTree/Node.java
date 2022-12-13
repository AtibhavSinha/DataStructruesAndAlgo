package trees.binaryTree;

// Tree can have any number of nodes
// Hierarchical DS where as LL, Stack and queue are Linear DS.
// Root, leaf, edge, same level = siblings
// Traversing a Tree : Breath first (Visiting all nodes at a level) and Depth First
public class Node<T> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}
