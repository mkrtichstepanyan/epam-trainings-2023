package homework_1.Ruzanna_Marutyan;
//Demonstrate char data type.
class CharDemo {
    public static void main (String args[]){
        char ch1, ch2;
        ch1=88; //code for x
        ch2='Y';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " "+ ch2);
        //ch1 is assigned the value 88, which is the ASCII (and Unicode)
        //value that corresponds to the letter X. As mentioned, the ASCII character set
        //occupies the first 127 values in the Unicode character set. For this reason, all
        //the “old tricks” that you may have used with characters in other languages will
        //work in Java, too.
        //output-ch1 and ch2: X Y
    }
}
