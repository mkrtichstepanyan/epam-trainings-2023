package homework_14.Nona_Asatryan.chapter_14;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
