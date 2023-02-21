package homework_6.Galust_Arzumanyan;

class B1 extends A1{
    int i;
    B1(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("i in superclass: " + super.i );
        System.out.println("i in subclass: " + i );
    }
}
