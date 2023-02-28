package homework_8.Anush_Ananyan;

class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members too.");
    }
}
