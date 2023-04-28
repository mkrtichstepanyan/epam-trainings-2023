package homework_17.TatevKocharyan.genericLinkedList;

public class Node<T> {

    T data;
    Node<T> next;
    int index;

    public Node() {
    }

    public Node(T data, Node<T> next, int index) {
        this.data = data;
        this.next = next;
        this.index = index;
    }

    public Node(int index) {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", index=" + index +
                '}';
    }
}