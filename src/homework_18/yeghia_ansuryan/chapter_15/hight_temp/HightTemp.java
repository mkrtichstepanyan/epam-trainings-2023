package homework_18.yeghia_ansuryan.chapter_15.hight_temp;

public class HightTemp {
    private int hTemp;

    HightTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HightTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HightTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
