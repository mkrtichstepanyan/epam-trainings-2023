package homework_17.araksya_ghazaryan;

public class Node<E> {
    E element;
    Node<E> prev;
    Node<E> next;

    public Node(E element, Node<E> prev, Node<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
}