package homework_3.Lilit_Adamyan.chapter_5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return.");
        if(t){
            return;
        }
        System.out.println("This wont execute.");
    }
}
