package homework_14.Qnarik_Khachatryan.chapter_14.generic_interface;

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();

}
