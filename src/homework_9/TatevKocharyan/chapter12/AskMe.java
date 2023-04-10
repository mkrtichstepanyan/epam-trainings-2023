package homework_9.TatevKocharyan.chapter12;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO -> System.out.println("No");
            case YES -> System.out.println("Yes");
            case MAYBE -> System.out.println("Maybe");
            case LATER -> System.out.println("Later");
            case SOON -> System.out.println("Soon");
            case NEVER -> System.out.println("Never");
        }
    }


    public static void main(String[] args) {
        Question q=new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
