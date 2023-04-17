package homework_17.Nona_Asatryan.genericLinkedList;

public class Node<E> {

    E element;
     Node<E> nextElement;

    public Node(E element) {
        this.element = element;
        this.nextElement = null;
    }

    public Node() {
    }
}
