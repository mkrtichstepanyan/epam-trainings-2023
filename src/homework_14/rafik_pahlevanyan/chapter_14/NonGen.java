package homework_14.rafik_pahlevanyan.chapter_14;

public class NonGen {
    Object ob;  //ob is now of type object

    NonGen(Object o) {
        ob = o;
    }

    //return type Object
    Object getOb() {
        return ob;
    }

    //show type of object
    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }

}
