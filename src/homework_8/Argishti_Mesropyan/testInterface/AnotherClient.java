package homework_8.Argishti_Mesropyan.testInterface;

class AnotherClient implements CallBack {
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}
