package homework_8.Qnarik_Khachatryan.chapter_9.Interface;

class AnotherClient implements CallBack {
    //Implement CallBack's interface
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}
