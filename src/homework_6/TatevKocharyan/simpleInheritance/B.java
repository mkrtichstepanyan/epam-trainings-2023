package homework_6.TatevKocharyan.simpleInheritance;

import homework_6.TatevKocharyan.simpleInheritance.A;

public class B extends A {
    int k;
    void showk(){
        System.out.println("k: ");
    }

    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}