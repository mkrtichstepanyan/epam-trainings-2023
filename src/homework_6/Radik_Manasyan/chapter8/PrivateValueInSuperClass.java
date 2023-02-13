package homework_6.Radik_Manasyan.chapter8;

public class PrivateValueInSuperClass {
    int i;
    private int j;

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

class B1 extends PrivateValueInSuperClass {
    int total;

    void sum() {
//        total = i + j;//ERROR value: because j private in super class
        System.out.println("ERROR value: because j private in super class.");
    }
}
