package homework_6.Aram_Mehrabyan.Chapter8;
class A{
    int i,j;
    void  showij(){
        System.out.println("i and j: "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.print("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();
        superOb.i=10;
        superOb.j=20;
        System.out.println("Contents of super object: ");
        superOb.showij();
        System.out.println();
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("Contents of sub object: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i,jand k: ");
        subOb.sum();


    }
}
