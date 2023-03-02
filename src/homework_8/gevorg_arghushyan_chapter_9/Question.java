package homework_8.gevorg_arghushyan_chapter_9;

import java.util.Random;

public class Question implements SharedConstants{
    Random rand = new Random();
    int ask(){
        int prop = (int) (100 * rand.nextDouble());
        if (prop < 30){
            return NO;
        } else if (prop < 60) {
            return YES;
        }else if (prop < 75) {
            return LATER;
        } else if (prop < 98) {
            return SOON;
        }else {
            return NEVER;
        }
    }
}
