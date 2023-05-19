package homework_19.qnarik_khachatryan.chapter_15;

//Use an instance method reference with different objects.

//A functional interface that takes two reference arguments and returns a boolean result.

interface MyFunc1<T> {
    boolean func(T v1, T v2);
}

//A class that stores the temperature high for a day.
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    //Return true if the invoking HighTemp object has the same temperature at ht2.
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }
    //Return true if the invoking HighTemp object has a temperature that is less than ht2.
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}




