package homework_17.Ani_Barseghyan.generic_linked_list;

public class Node<Type> {
    Type data;
    Node<Type> next;
    Node<Type> prev;

    Node(Type data) {
        this.data = data;
    }

    Node(Node<Type> prev, Type data, Node<Type> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
