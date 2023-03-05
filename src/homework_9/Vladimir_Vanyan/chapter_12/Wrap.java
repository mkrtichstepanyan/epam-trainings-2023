package homework_9.Vladimir_Vanyan.chapter_12;

//Demonstrate a type wrapper
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100);

        int i = iOb.intValue();
        System.out.println(i + " " + iOb);  //displays 100 100
    }
}
