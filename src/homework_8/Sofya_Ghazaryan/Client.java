package homework_8.Sofya_Ghazaryan;

public class Client implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("Callback called with " + param);
    }

    void nonIFaceMeth() {
        System.out.println("Classes that implement interfaces "
                + "may also define other members");
    }
}
