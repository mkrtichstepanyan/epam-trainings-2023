package homework_14.Shushanik_araqelyan;

public class GenericStack<T> {
    private static int MINIMUM_SIZE = 10;
    private T [] array = (T[]) new Object[MINIMUM_SIZE];
    private int size = 7;


    public  T push(T value){
        if(size >= array.length);
        array[size++] = value;
        return value;
    }
    public  T pop(){
        if(size<=array.length);
        T t = array[--size];
        return t;
    }

}
