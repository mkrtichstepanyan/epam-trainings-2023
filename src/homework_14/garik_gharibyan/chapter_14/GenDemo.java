package homework_14.garik_gharibyan.chapter_14;
class Gen<T>{
    T ob;
    Gen(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v);

        System.out.println();

        Gen<String> strOb;
        strOb = new Gen<>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);


    }
}
