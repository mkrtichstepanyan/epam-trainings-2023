package homework_8.aram_mehrabyan.interfaces;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("defined other members too");
    }
}
