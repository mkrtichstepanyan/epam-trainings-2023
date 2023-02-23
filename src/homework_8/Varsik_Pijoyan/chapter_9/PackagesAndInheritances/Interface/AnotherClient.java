package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.Interface;

public class AnotherClient implements CallBack{
    public void callBack(int p){
        System.out.println("another version of callBack");
        System.out.println("p squared is " + (p * p));
    }

}
