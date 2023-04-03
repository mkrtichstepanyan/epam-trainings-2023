package homework_14.Radik_Manasyan.chapter14;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}
