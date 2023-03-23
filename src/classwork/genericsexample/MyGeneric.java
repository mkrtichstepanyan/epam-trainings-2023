package classwork.genericsexample;

public class MyGeneric<Type> {

    private Type object;

    public MyGeneric(Type object) {
        this.object = object;
    }

    public Type getObject() {
        return object;
    }
}
