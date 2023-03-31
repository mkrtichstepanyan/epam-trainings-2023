package homework_14.Qnarik_Khachatryan.chapter_14.bounded_wildcards;

//This class holds an array of coordinate objects.
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }

}
