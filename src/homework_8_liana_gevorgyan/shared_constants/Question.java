package homework_8_liana_gevorgyan.shared_constants;

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
