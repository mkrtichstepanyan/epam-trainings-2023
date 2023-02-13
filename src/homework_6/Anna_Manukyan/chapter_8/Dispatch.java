package homework_6.Anna_Manukyan.chapter_8;

public class Dispatch {
    public static void main(String[] args) {
        AWithDynamicDispatch a = new AWithDynamicDispatch();
        BWithDynamicDispatch b = new BWithDynamicDispatch();
        CWithDynamicDispatch c = new CWithDynamicDispatch();

        AWithDynamicDispatch r;
        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
