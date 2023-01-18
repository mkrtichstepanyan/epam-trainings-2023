package Gevorg_Martirosian.chapter_5;

//demonstration of return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("before return");
        if (t) {
            return;
        }
        System.out.println("this will not work");
    }
}
