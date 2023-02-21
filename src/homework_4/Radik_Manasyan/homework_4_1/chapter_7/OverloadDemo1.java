package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class OverloadDemo1 {
    void test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("Bнyтpeннee преобразование при вызове test(double) a: " + a);
    }
}
