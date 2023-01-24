package homework_3.Qnarik_Khachatryan.chapter_5;

//Demonstrate return
//the return statement immediately terminates the method in which it is executed.
class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return");
        if (t) {
            return; // return to caller
        }
        System.out.println("This won't execute");
    }
}
