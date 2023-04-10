package homework_14.Qnarik_Khachatryan.chapter_14.generic_subclass;

//A generic subclass

class Gen<T> extends NonGen {
    T ob; //declare an object of type T

    // Pass the constructor a reference to an object of type T.
    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    //Return ob.
    T getOb() {
        return ob;
    }

}
