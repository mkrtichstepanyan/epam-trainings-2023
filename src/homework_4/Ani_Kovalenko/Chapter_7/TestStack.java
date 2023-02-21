package homework_4.Ani_Kovalenko.Chapter_7;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i=0;i<10;i++){
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: ");
        for(int i=0;i<10;i++){
            System.out.println(mystack2.pop());
        }
    }
}
