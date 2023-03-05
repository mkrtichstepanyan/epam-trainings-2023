package homework_9.Vladimir_Vanyan.chapter_12;

import java.util.Random;

public class Question {

    Random random = new Random();

    Answers ask() {
        int prob = (int) (100 * random.nextDouble());
        if (prob < 15)
            return Answers.MAYBE;   //15%
        else if (prob < 30)
            return Answers.NO;      //15%
        else if (prob < 60)
            return Answers.YES;     //30%
        else if (prob < 75)
            return Answers.LATER;   //15%
        else if (prob < 98)
            return Answers.SOON;    //13%
        else
            return Answers.NEVER;   //2%
    }
}