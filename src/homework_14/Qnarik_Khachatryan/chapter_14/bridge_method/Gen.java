package homework_14.Qnarik_Khachatryan.chapter_14.bridge_method;

// A simple generic class. Here, T is a type parameter that will be replaced by a real type
// when an object of type Gen is created .

class Gen<T> {
    T ob; //declare an object of type T

    // Pass the constructor a reference to an object of type T.
    Gen(T o) {
        ob = o;
    }

    //Return ob.
    T getOb() {
        return ob;
    }

}
