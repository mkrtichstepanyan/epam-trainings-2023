package homework_6.Aram_Mehrabyan.Chapter8;
class A4{
    int i,j;
    A4(int a,int b){
       i=a;
       j=b;
    }
    void show(){
        System.out.println("i and j "+i+" "+j);
    }
}
class B4 extends A4{
    int k;
    B4(int a,int b,int c){
        super(a,b);
        k=c;
    }
    void show(){
        super.show();
        System.out.println("k: "+k);
    }
}
public class Override {
    public static void main(String[] args) {
        B4 subob=new B4(1,2,3);
        subob.show();
    }
}
