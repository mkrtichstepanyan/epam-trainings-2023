package homework_17.Qnarik_Khachatryan.GenericLinkedList;

public class Node<T> {
    T value;
    Node<T> nextNode; //reference for next node

    Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    Node(T value){ //using when we don't know nextNode and prevNode
        this.value = value;
    }
}

