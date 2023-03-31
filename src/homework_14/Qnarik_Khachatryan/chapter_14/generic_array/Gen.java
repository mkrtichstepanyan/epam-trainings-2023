package homework_14.Qnarik_Khachatryan.chapter_14.generic_array;


class Gen<T extends Number> {
    T ob;

    T[] vals; //OK

    Gen(T o, T[] nums) {
        ob = o;


        //This statement is illegal.
//    vals = new T[10];     //can't create an array of T

        //This one is OK
        vals = nums;  //Ok to assign reference to existent array
    }
}
