package homework_6.Liana_Gevorgyan.Chapter_8.Using_Super;
//Using super to overcome name hiding.

 class A1 {
     int i;

}
//create a subclass by extending class A1.
class B1 extends A1{
     int i; // this i hides the i in A.java
    B1(int a, int b){
        super.i = a;//i in A.java
        i=b; //i in B
    }
    void show()
    {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " +  i);
    }
}
class UseSuper{
    public static void main(String[] args) {
        B1 subOb = new B1 (1,2);
        subOb.show();
    }
}
