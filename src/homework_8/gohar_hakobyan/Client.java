package homework_8.gohar_hakobyan;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Callback valled with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too ");
    }

}
