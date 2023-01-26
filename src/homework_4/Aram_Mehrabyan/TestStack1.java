package homework_4.Aram_Mehrabyan;

public class TestStack1 {
    public static  void main(String []args){
        Stack1 mystck1=new Stack1();
        Stack1 mystck2=new Stack1(20);
        for(int i=0;i<mystck1.stck.length;i++) mystck1.push(i);
        for(int i=0;i<mystck2.stck.length;i++) mystck2.push(i);
        System.out.println("Stack in my mystck1: ");
        for(int i=0;i<mystck1.stck.length;i++)
            System.out.println(mystck1.pop());
        System.out.println("Stack in my mystck2: ");
        for(int i=0;i<mystck2.stck.length;i++)
            System.out.println(mystck2.pop());
    }
}
