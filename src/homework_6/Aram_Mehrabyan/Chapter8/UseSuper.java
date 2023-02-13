package homework_6.Aram_Mehrabyan.Chapter8;
class A2{
    int i;
}
class B2 extends A2{
    int i;
    B2(int a,int b){
        super.i=a;
        i=b;
    }
        void show(){
            System.out.println("i in superclass is "+super.i);
            System.out.println("i in subclass is "+i);
        }

}
public class UseSuper {
    public static void main(String[] args) {
        B2 subob=new B2(1,2);
        subob.show();

    }
}
