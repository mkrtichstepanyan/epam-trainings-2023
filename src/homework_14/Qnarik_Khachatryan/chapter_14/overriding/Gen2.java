package homework_14.Qnarik_Khachatryan.chapter_14.overriding;

class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }

    //override
    T getOb() {
        System.out.print("Gen2's getOb(): ");
        return ob;
    }
}
