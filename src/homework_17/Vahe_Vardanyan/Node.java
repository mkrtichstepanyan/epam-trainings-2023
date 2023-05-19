package homework_17.Vahe_Vardanyan;

public class Node<T> {
    T item;
    Node<T> prevItem;
    Node<T> nextItem;

    public Node(T item, Node<T> prevItem, Node<T> nextItem) {
        this.item = item;
        this.prevItem = prevItem;
        this.nextItem = nextItem;
    }

    public Node() {

    }

    public Node(T element) {
        item = element;
    }

}