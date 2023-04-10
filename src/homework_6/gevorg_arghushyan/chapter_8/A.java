package homework_6.gevorg_arghushyan.chapter_8;

public class A {
    int i, j;
    void showij(){
        System.out.println("i and j: " + i + " " + j );
    }
}
class B extends A {
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i+j+k: " + (i + j + k));
    }
}
class Simpleinheritance{
    public static void main(String[] args) {
        A superOBj = new A();
        B subob = new B();
        superOBj.i = 10;
        superOBj.j = 20;
        System.out.println("content superOBj: " );
        superOBj.showij();
        System.out.println();
        subob.i = 7;
        subob.j = 8;
        subob.k = 9;
        System.out.println("content subob: " );
        subob.showij();
        subob.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subob: ");
        subob.sum();
    }
}