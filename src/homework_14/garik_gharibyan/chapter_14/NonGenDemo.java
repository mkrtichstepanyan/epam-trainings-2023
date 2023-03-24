package homework_14.garik_gharibyan.chapter_14;
class NonGen{
    Object ob;
    NonGen(Object ob){
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Type of ob is: " + ob.getClass().getName());
    }
}
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);
        iOb.showType();
        int v =(int) iOb.getOb();
        System.out.println("Value: " + v);

        System.out.println();

        NonGen strOb = new NonGen("Non-Generics Test");
        strOb.showType();
        String str =(String) strOb.getOb();
        System.out.println("Value: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb();


    }
}
