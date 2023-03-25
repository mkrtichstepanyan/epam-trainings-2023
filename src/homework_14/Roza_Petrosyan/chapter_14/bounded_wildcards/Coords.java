package homework_14.Roza_Petrosyan.chapter_14.bounded_wildcards;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
