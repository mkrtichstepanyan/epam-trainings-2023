package homework_8.Hovhannes_Gspeyan.chapter_9.sharedConstants;

import java.util.Random;

public class Question implements SharedConstants {

    Random rand = new Random();

    int ask(){
        int prob = (int) (100 * rand.nextDouble());
        if(prob < 30){
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return MAYBE;
        } else if (prob < 98) {
            return SOON;
        }else {
            return NEVER;
        }
    }
}
