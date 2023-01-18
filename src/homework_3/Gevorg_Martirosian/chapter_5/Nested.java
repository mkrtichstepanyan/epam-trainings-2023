package Gevorg_Martirosian.chapter_5;

//loops can be nested
public class Nested {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for (int j = i; j < 10; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
