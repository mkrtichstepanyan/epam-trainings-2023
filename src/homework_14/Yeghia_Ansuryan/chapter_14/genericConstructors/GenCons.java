package homework_14.Yeghia_Ansuryan.chapter_14.genericConstructors;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }
    void showVal(){
        System.out.println("val: " + val);
    }
}
