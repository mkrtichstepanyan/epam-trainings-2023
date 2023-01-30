package homework_4.Aram_Mehrabyan.chapter7;

public class OverLoad1 {
    public static void main(String []args){
        OverLoadDemo1 ob=new OverLoadDemo1();
        int i=88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.25);


    }
}
