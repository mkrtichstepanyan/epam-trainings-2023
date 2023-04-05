package homework_14.gevorg_arghushyan;

public class Demo {
    public static void main(String[] args) {

        GenericStack<Object> genericStack = new GenericStack<>();

        genericStack.push(false);
        genericStack.push(true);
        genericStack.push(true);

        System.out.println(genericStack.size + "ok");
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
    }
}
