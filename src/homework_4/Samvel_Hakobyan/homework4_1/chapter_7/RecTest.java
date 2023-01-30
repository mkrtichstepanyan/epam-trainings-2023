package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class RecTest {
    int [] values;
    RecTest(int i){
        values = new int [i];
    }
    void prinArray(int i){
        if (i == 0){
            return;
        }else {
            prinArray(i-1);
        }
        System.out.println("[" + (i-1) + "] " + values[i - 1]);
    }
}
