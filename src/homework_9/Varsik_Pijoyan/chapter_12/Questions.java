package homework_9.Varsik_Pijoyan.chapter_12;

import java.util.Random;

public class Questions {
    Random random = new Random();
    Answers ask() {
        int prob = (int) (100 * random.nextDouble());

        if(prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 75)
            return Answers.LATER;
        else if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }

}
