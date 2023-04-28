package homework_17.anna_manukyan;

public class Node<T> {
    T element;
    Node<T> prev;
    Node<T> next;

    public Node(T element, Node<T> prev, Node<T> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
}
