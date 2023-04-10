package homework_9.Roza_Petrosyan.chapter_12.Enum3;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case MAYBE -> System.out.println("Maybe");
            case NO -> System.out.println("No");
            case YES -> System.out.println("Yes");
            case LATER -> System.out.println("Later");
            case SOON -> System.out.println("Soon");
            case NEVER -> System.out.println("Never");
        }
    }

    public static void main(String[] args) {
        Questions questions = new Questions();
        answer(questions.ask());
        answer(questions.ask());
        answer(questions.ask());
    }
}
