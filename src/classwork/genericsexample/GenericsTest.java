package classwork.genericsexample;

// type safety
// from java 5 || 1.5
// type erasure
public class GenericsTest {

    public static void main(String[] args) {
        MyGeneric<String> myGenericString = new MyGeneric<>("string");
//        MyGeneric<Integer> myGenericInt = new MyGeneric<>(150);
//        MyGeneric<Number> myGenericDouble = new MyGeneric<>(150d);
//        MyGeneric<Object> myGenericObj = new MyGeneric<>(150d);
//        MyGeneric myGeneric = new MyGeneric(new Object());

//        printMyGenericNumber(myGenericInt);
//        printMyGenericNumber(myGenericDouble);
//        printMyGenericNumber(myGenericObj);
//        printMyGenericNumber(myGenericString);

    }

    // row type
    private static void printMyGenericNumber (MyGeneric<? super Integer> myGeneric) {
        System.out.println(myGeneric.getObject());
    }
}
