package homework_6.gevorg_arghushyan.chapter_8;

public class Aaa {
    int i;
}
class Bbb extends Aaa{
    int i;
    Bbb(int a, int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in Super class: " + super.i);
        System.out.println("i in sub class: " + i);
    }
}

class UseSuperAB{
    public static void main(String[] args) {
        Bbb subOb = new Bbb(1, 2);
        subOb.show();
       Aaa a = new Aaa();
        System.out.println(a.i);
    }
}