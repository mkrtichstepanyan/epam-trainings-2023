package homework_6.Varsik_Pijoyan.chapter_8.InheritanceBasic;



public class B extends A {
    int k;

    void showK(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println("i , j , k: " + (i + j + k));
    }
}
