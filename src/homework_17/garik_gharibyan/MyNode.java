package homework_17.garik_gharibyan;

public class MyNode<T extends Comparable<T>> implements Comparable<MyNode<T>> {
    private T element;
    private  MyNode<T> next;

    MyNode(T element){
        this.element = element;
    }
    public MyNode<T> next(){
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    @Override
    public int compareTo(MyNode<T> o) {
        return this.element.compareTo(o.element);
    }
}
