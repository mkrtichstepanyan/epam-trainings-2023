package homework_6.gevorg_arghushyan.chapter_8;

public class Aa {
    int i;
    private int j;
    void seij (int x, int y){
        i = x;
        j = j;
    }
    int sum (int x, int y){
        return x+y;
    }
}
class Bb extends Aa{
    int total;
    void sum(){
        // total = i + j;
    }
}
class Access {
    public static void main(String[] args) {
        Bb subOb = new Bb();
        subOb.seij(10, 12);
        int aaa = subOb.sum(10, 12);
        System.out.println("Sum is equal to  " + aaa);
    }
}
