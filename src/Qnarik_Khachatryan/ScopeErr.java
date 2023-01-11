package Qnarik_Khachatryan;

//This program will not compile

/* хотя блоки могут быть вложенными, мы не можем
объявить переменную с тем же именем, что и у переменной во внешней области видимости */

class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {            // creates a new scope
            // int bar = 2; // compile-time error - bar already defined!
        }
    }
}
