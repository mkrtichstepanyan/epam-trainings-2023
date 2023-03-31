package homework_14.Qnarik_Khachatryan.chapter_14;

class Gen2<T, V> extends Gen<T> {

    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}
