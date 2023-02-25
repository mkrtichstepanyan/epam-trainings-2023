package homework_8.garik_gharibyan.chapter_9.shared_constants;

import java.util.Random;

public class Questions implements SharedConstants {

    Random random = new Random();
    int ask(){
        int prob =(int) (100 * random.nextDouble());
        if (prob < 30){
            return NO;
        } else if (prob < 60) {
            return YAS;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        }else {
            return NEVER;
        }
    }
}
