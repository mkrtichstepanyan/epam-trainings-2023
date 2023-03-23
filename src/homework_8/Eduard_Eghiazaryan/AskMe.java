package homework_8.Eduard_Eghiazaryan;

public class AskMe implements SharedConstance {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("yes");
                break;
            case MAYBE:
                System.out.println("maybe");
                break;
            case LATER:
                System.out.println("later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("never");
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