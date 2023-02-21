package homework_6.Vazgen_Harutyunyan.chapter_8.member_access;

public class B extends A{
    int total;

    void sum(){
//        total = i + j;
        System.out.println("i + j :ERROR,j is not accessible here");
    }
}
