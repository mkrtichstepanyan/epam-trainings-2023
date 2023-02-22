package homework_8.Qnarik_Khachatryan.chapter_9.Interface;

class Client implements CallBack {
    //Implement CallBack's interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}
