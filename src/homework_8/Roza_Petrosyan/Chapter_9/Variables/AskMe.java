package homework_8.Roza_Petrosyan.Chapter_9.Variables;

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }


    public static void main(String[] args) {
        Questions q = new Questions();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
