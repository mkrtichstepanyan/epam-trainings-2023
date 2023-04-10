package homework_9.rafik_pahlevanyan.chapter_12;

public class AskMe {
    static void answer (Answers result){
        switch (result){
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
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
