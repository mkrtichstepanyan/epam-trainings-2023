package homework_8.Anna_manukyan.chapter_8.InterfaceExample;

public class Client implements CallBack {
    @Override
    public void callBack(int p) {
        System.out.println("callback called with "+p);
    }
    void nonIfaceMehod(){
        System.out.println("Classes that implement interfaces may also define other members,too. ");
    }
}
