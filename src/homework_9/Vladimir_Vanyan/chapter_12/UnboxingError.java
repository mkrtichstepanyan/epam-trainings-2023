package homework_9.Vladimir_Vanyan.chapter_12;

//An error produced by manual unboxing
public class UnboxingError {
    public static void main(String[] args) {

        Integer iOb = 1000; //autobox the value 1000
        int i = iOb.byteValue();    //manually unbox as byte
        System.out.println(i);  //doesn`t display 1000

    }
}
