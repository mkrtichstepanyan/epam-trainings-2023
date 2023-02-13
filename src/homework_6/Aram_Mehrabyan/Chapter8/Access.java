package homework_6.Aram_Mehrabyan.Chapter8;

class A1{
    int i;
    private  int j;
    void setij(int x,int y){
        i=x;
        j=y;
    }
}
    class  B1 extends A1{
        int total;
        void sum(){
        //total=i+j;
        }

        }
public class Access {
    public static void main(String[] args) {
     B1  subob=new B1();
     subob.setij(10,12);
     subob.sum();
        System.out.println("Total is: "+subob.total);
    }
}
