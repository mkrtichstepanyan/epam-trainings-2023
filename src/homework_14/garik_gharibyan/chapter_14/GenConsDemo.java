package homework_14.garik_gharibyan.chapter_14;

class GenCons{
    private double val;
    <T extends Number>GenCons(T arg){
        val = arg.doubleValue();
    }
    void showVal(){
        System.out.println("Val: " + val);
    }
}
public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test1 = new GenCons(100);
        GenCons test2 = new GenCons(12.e1);

        test1.showVal();
        test2.showVal();
    }
}
