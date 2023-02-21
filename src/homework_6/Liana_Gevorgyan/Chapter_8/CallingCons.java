package homework_6.Liana_Gevorgyan.Chapter_8;
//Demonstrate a super class
class CallingCons {
    public static void main(String[] args) {
        C2 c =new C2();
    }
}
class A2{
    A2(){
        System.out.println("Inside A2's constructor. ");
    }
}
//Create a subclass by extending class A2
class B2 extends A2{
    B2(){
        System.out.println("Inside B2's constructor. ");
    }
}
//Create another subclass by extending B2
class C2 extends B2{
    C2(){
        System.out.println("Inside c's constructor. ");
    }
}

