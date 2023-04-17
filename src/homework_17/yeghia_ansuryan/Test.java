package homework_17.yeghia_ansuryan;

public class Test {
    public static void main(String[] args) {

        GenericLinkedList<Number> linkedListObject = new GenericLinkedList<>();

        linkedListObject.add(1.1);
        linkedListObject.add(2);
        linkedListObject.add(3.3);

        System.out.println(linkedListObject);

        linkedListObject.add(1, 4.4);
        System.out.println(linkedListObject);
    }
}
