package homework_8.Vahe_Vardanyan.Interface;

abstract class Incomplete implements  Callback {
    int a, b;
    void show(){
        System.out.println(a + " " + b);
    }
}
