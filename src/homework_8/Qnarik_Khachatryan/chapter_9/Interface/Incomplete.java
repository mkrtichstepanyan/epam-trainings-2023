package homework_8.Qnarik_Khachatryan.chapter_9.Interface;


/*The class Incomplete does not implement callback(
) and must be declared as abstract. Any class that inherits
Incomplete must implement callback( ) or be declared
abstract itself.*/
abstract class Incomplete implements CallBack {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
