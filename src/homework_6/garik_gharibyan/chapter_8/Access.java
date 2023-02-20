package homework_6.garik_gharibyan.chapter_8;

class A1{
    int i;
    private int j;

    void setIJ(int x, int y){
        i = x;
        j = y;
    }
}
class B1 extends A1{
    int total;

    void sum(){
//        total = i + i;         Error j is not accessible her
    }
}

public class Access {
    public static void main(String[] args) {
        B1 childOb = new B1();

        childOb.setIJ(10,12);

        childOb.sum();
        System.out.println(childOb.total);
    }
}
