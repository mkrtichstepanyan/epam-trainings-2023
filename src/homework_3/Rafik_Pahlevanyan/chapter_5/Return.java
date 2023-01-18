package homework_3.Rafik_Pahlevanyan.chapter_5;

//Demonstrate return
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before return.");
        if (t) {
            return; //return to caller
        }
        System.out.println("This won`t execute.");
    }
}
