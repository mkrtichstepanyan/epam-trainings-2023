package classwork.lambdaexp;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// pure function
// aic
public class LambdaTest {

    // closure - замыкание
    // higher order object
    public static void main(String[] args) {

        Stream.of("str").map(s -> s.toLowerCase()).collect(Collectors.toSet());
    }

    public void methodName() {
        // anonymous function implementation of functional interface
//        MyInterface<Integer, String> integerStringMyInterface = this::printString;

//        myMethod(integerStringMyInterface);
    }

    public int printString(String text) {
        System.out.println(text);
        return Integer.parseInt(text);
    }

//    static void myMethod(MyInterface<Integer, String> myInterface) {
//        myInterface.method("150");
//    }

}

// functional interface
interface MyInterface<R, T, V, Q> {

    R method(T type, V vtype, Q qType);

    default void myDef() {

    }

    default void myDef2() {

    }

    static void myDef3() {

    }

    private void myDef4() {

    }

}
