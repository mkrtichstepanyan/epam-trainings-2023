package homework_14.Roza_Petrosyan.chapter_14.generic_interfaces;

public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
