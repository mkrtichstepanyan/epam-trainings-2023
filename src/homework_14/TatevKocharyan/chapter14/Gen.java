package homework_14.TatevKocharyan.chapter14;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }


    T getOb() {
        return ob;
    }

    void showType(){
        System.out.println("Type of T is"+
                ob.getClass().getName());
    }
}