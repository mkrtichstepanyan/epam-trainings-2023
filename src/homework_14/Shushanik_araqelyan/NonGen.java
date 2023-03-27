package homework_14.Shushanik_araqelyan;

public class NonGen {
    Object ob;
    NonGen(Object o){
        ob = o;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of ob is" + ob.getClass().getName());
    }
}
