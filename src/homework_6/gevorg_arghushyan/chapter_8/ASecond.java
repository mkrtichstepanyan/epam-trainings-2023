package homework_6.gevorg_arghushyan.chapter_8;

public class ASecond {
    int i;

}
class BSecond extends ASecond{
    int i;
    BSecond(int a , int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in super class " + super.i);
        System.out.println("i in sub class " + i);
    }
}
class UseSuper{
    public static void main(String[] args) {
        BSecond subOb = new BSecond(1, 2);
        subOb.show();
    }
}
