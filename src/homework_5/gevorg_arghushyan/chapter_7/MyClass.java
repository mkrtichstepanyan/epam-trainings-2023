package homework_5.gevorg_arghushyan.chapter_7;

public class MyClass {
    private  int i;
    MyClass(int k) {i = k;}
    int geti() {return i;}
    void seti(int k){if (k >= 0) i = k;}
}
class RefVarDemo{
    public static void main(String[] args){
        var mc = new MyClass(10);
        System.out.println("the value i in mc now is equal " + mc.geti());
        mc.seti(19);
        System.out.println("the value i in mc now is equal " + mc.geti());
    }
}
