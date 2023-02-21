package homework_7.Anna_Manukyan.chapter_8.interfaceExample;

public class Client implements CallBack {
    @Override
    public void callBack(int p) {
        System.out.println("callback called with "+p);
    }
    void nonIfaceMehod(){
        System.out.println("Classes that implement interfaces may also define other members,too. ");
    }
}
