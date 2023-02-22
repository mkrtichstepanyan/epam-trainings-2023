package homework_8.Hovhannes_Gspeyan.defaultStaticInterface;

public class MyIfImp2 implements MyIf {

    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "This is a different String";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
