package homework_9.garik_gharibyan.chapter_12;

import java.util.Random;

enum Answers {
    NO,YES,MAYBE,LATER,SOON,NEVER;
}

class Question{
    Random random = new Random();
    Answers ask(){
        int i = (int) (100 * random.nextDouble());
        if (i < 15){
            return Answers.MAYBE;
        } else if (i < 30) {
            return Answers.NO;
        } else if (i < 60) {
            return Answers.YES;
        } else if (i < 75) {
            return Answers.LATER;
        } else if (i < 98) {
            return Answers.SOON;
        }else {
            return Answers.NEVER;
        }
    }
}

public class AskMe{
    static void answer(Answers result){
        switch (result){
            case NO:
                System.out.println("NO");
                break;
            case YES:
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

        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

