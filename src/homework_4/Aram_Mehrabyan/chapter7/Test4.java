package homework_4.Aram_Mehrabyan.chapter7;

public class Test4 {
    int a;
    public int b;
    private int c;
    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }
}
     class AccessTest{
         public static void main(String[] args) {
         Test4 ob=new Test4();
         ob.a=10;
         ob.b=20;
         //ob.c=100;
             ob.setc(100);
             System.out.println("a,b an c: "+ob.a+" "+ob.b+" "+ob.getc());
         }
     }

