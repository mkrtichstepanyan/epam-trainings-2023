package homework_4.Aram_Mehrabyan.chapter7;

public class Test3 {
    int a;
    Test3 (int i){
        a=i;
    }
    Test3 incrByTen(){
        Test3 temp=new Test3(a+10);
        return temp;
    }
}
class RetObj{
    public static void main(String []args){
        Test3 ob1=new Test3(2);
        Test3 ob2;
        ob2=ob1.incrByTen();
        System.out.println("a before increment by ten "+ob1.a);
        System.out.println("a after increment by ten "+ob2.a);
        ob2=ob2.incrByTen();
        System.out.println("a after second increment by ten "+ob2.a);
    }
}
