package homework_14.garik_gharibyan.chapter_14;

class TwoGen<T, V> {
    T ob1;
    V ob2;
    TwoGen(T ob1,V ob2) {

        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    void showType(){
        System.out.println("Type of T is: "+ ob1.getClass().getName());
        System.out.println("Type of V is: "+ ob2.getClass().getName());
    }
}

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tGObj = new TwoGen<>(88,"Generics");
        tGObj.showType();

        int v = tGObj.getOb1();
        System.out.println("Value: " + v);
        String str = tGObj.getOb2();
        System.out.println("Value: " + str);

    }
}
