package homework_6.TatevKocharyan.useOfsuper;

public class B  extends A{
    int i; //hides the i in A.java
    B(int a,int b){
        super.i=a;
        i=b;
    }
    void show(){
        System.out.println("i in superclass: "+ super.i);
        System.out.println("i in subclass: "+i);
    }


}
