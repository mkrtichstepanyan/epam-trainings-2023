package homework_8.garik_gharibyan.chapter_9.shared_constants;

public class AskMe implements SharedConstants {
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("NO");
                break;
            case YAS:
                System.out.println("YAS");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
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
