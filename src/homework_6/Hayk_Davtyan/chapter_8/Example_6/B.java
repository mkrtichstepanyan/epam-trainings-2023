package homework_6.Hayk_Davtyan.chapter_8.Example_6;

import homework_6.Hayk_Davtyan.chapter_8.Example_6.A;

public class B extends A {
    int k;
    B(int a, int b, int c){
        super(a,b);
        k =c;
    }
    void show(){
        System.out.println("k: " + k);
    }
}
