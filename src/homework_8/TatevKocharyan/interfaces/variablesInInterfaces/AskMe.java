package homework_8.TatevKocharyan.interfaces.variablesInInterfaces;

public class AskMe implements SharedConstants {

    static void answer(int result) {
        switch (result) {
            case NO -> System.out.println("NO");
            case YES -> System.out.println("YES");
            case MAYBE -> System.out.println("Maybe");
            case LATER -> System.out.println("Later");
            case SOON -> System.out.println("Soon");
            case NEVERE -> System.out.println("Never");
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


