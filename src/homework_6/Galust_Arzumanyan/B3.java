package homework_6.Galust_Arzumanyan;

class B3 extends A3{
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(){
        super.show();
        System.out.println("k is: " + k);
    }
}
