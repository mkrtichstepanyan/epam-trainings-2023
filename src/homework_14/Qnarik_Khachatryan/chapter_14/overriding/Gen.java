package homework_14.Qnarik_Khachatryan.chapter_14.overriding;


class Gen<T> {
    T ob; //declare an object of type T

    // Pass the constructor a reference to an object of type T.
    Gen(T o) {
        ob = o;
    }

    //Return ob.
    T getOb() {
        System.out.print("Gen's getOb(): ");
        return ob;
    }

}
