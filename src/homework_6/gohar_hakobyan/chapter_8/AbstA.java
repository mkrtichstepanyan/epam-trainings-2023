package homework_6.gohar_hakobyan.chapter_8;

public abstract class AbstA {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is concrete method. ");
    }
}

class B2 extends AbstA {
    void callMe() {
        System.out.println("B2 is implementation of callMe. ");
    }
}