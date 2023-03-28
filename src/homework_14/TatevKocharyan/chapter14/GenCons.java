package homework_14.TatevKocharyan.chapter14;

public class GenCons {
    private double val;
    <T extends Number>GenCons(T arg){
        val=arg.doubleValue();
    }
    void showVal(){
        System.out.println("val:"+val);
    }
}
