package homework_17.zara_avetyan.generic_linked_list;

public class Node<N> {

    private Node next;
    private N data;

    public Node(N data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public N getData() {
        return data;
    }

    public void setData(N data) {
        this.data = data;
    }
}
