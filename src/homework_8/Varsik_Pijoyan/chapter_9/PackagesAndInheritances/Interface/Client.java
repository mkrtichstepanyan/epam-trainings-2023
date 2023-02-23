package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.Interface;

public class Client implements CallBack{
    public void callBack(int p){
        System.out.println("callBack called with " + p);
    }
    void nonIFaceMeth(){
        System.out.println("classes that implement interfaces " +
                "may also define other members too.");
    }
}
