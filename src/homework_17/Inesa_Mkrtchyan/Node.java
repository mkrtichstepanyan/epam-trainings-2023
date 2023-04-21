package homework_17.Inesa_Mkrtchyan;

public class Node<T>{
    private T value;
    private Node next;
    private Node prevue;

    public Node(T value, Node next, Node prevue) {
        this.value = value;
        next = next;
        this.prevue = prevue;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevue() {
        return prevue;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevue(Node prevue) {
        this.prevue = prevue;
    }
}
