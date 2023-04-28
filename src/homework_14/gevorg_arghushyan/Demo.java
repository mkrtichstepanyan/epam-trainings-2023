package homework_14.gevorg_arghushyan;

public class Demo {

    public static void main(String[] args) {

        GenericStack<Object> genericStack = new GenericStack<>();

//        genericStack.push(false);
//        genericStack.push(true);
//        genericStack.push(true);
//
//        System.out.println(genericStack.size + "ok");
//        System.out.println(genericStack.pop());
//        System.out.println(genericStack.pop());
//        System.out.println(genericStack.pop());

        int[] array = {1, 2, 3};
        int i = 0;
        int[] newArray = new int[3];
        while (i < array.length) {
            newArray[i] = array[i++];
        }
        for (int i1 : newArray) {
            System.out.println(i1);
        }
    }
}
