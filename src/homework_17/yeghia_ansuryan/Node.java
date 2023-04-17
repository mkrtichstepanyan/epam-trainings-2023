package homework_17.yeghia_ansuryan;

public class Node<T> {

    Node<T> nextNode;
    T element;
    Node<T> previousNode;

    Node(Node previousNode, T element, Node nextNode) {
        this.previousNode = previousNode;
        this.element = element;
        this.nextNode = nextNode;
    }

}
