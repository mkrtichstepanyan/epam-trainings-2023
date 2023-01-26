package homework_4.Aram_Mehrabyan.chapter_6;

public class TestStack {
    public static  void main(String []args){
        Stack mystck1=new Stack();
        Stack mystck2=new Stack();
        for(int i=0;i<10;i++) mystck1.push(i);
        for(int i=10;i<20;i++) mystck2.push(i);
        System.out.println("Stack in my mystck1: ");
        for(int i=0;i<10;i++)
            System.out.println(mystck1.pop());
        System.out.println("Stack in my mystck2: ");
        for(int i=10;i<20;i++)
            System.out.println(mystck2.pop());
    }
}
