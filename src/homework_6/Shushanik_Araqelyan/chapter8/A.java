package homework_6.Shushanik_Araqelyan.chapter8;

public class A {
    int I,J;
    void showij(){
        System.out.println("i and j: " + I + " " + J);
    }
}
class B extends A{
    int K;
    void showk(){
        System.out.println("K:" + K);
    }
    void sum(){
        System.out.println(" I + J + K :" + ( I + J + K));
    }
}