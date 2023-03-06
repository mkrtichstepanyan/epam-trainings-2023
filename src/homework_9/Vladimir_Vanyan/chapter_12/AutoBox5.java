package homework_9.Vladimir_Vanyan.chapter_12;

//Autoboxing/unboxing a Boolean and Character
public class AutoBox5 {
    public static void main(String[] args) {

        //Autobox/unbox a boolean
        Boolean b = true;
        if (b) System.out.println("b == true");

        //Autobox/unbox a char
        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 == " + ch2);
    }
}
