package homework_17.Roza_Petrosyan.generic_linked_list;

public class Node<T>{
    T item;
    Node<T> next;
    Node<T> prev;

    Node(Node<T> prev, T element, Node<T> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
