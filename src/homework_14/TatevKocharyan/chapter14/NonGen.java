package homework_14.TatevKocharyan.chapter14;

public class NonGen {
    Object ob;
    NonGen(Object o){
        ob=o;
    }

    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of ob is"+
                ob.getClass().getName());
    }
}