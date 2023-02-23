package homework_8.Hovhannes_Gspeyan.chapter_9.sharedConstants;

public class AskMe implements SharedConstants {

    static void answer(int result) {
        switch (result) {
            case NO -> System.out.println("NO");
            case YES -> System.out.println("YES");
            case MAYBE -> System.out.println("MAYBE");
            case LATER -> System.out.println("LATER");
            case SOON -> System.out.println("SOON");
            case NEVER -> System.out.println("NEVER");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
