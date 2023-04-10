package homework_8.Ani_Kovalenko;

public class AnotherClient implements CallBack{
    public void callBack(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
