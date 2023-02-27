package homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.Interface;

abstract class Incomplete implements CallBack{
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
}
