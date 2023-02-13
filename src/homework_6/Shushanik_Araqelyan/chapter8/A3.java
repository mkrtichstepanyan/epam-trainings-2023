package homework_6.Shushanik_Araqelyan.chapter8;

public class A3 {
    int i, j;
    A3(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println(" i and j :" + i + " " + j);
    }
}
class B3 extends A3{
    int k;
    B3(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void show(){
        System.out.println(" k: " + k);
    }
}