package homework_3.Qnarik_Khachatryan.chapter_5;
//Parts of the for loops can be empty

class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}
