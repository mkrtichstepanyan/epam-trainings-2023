package homework_18.TatevKocharyan.map;

public class Node<T, E> {

    private T key;
    private E value;
    Node<T, E> previous;
    Node<T, E> next;

    int index;

    public Node() {
    }

    public Node(T key,E value, Node<T, E> previous, Node<T, E> next, int index) {
        this.key = key;
        this.value=value;
        this.previous = previous;
        this.next = next;
        this.index = index;
    }

    public Node(int index) {
    }

    public Node<T, E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T, E> previous) {
        this.previous = previous;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Node<T, E> getNext() {
        return next;
    }

    public void setNext(Node<T, E> next) {
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
                "key=" + key +
                ", value=" + value +
                ", previous=" + previous +
                ", next=" + next +
                ", index=" + index +
                '}';
    }
}