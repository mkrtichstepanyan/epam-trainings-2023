package homework_8.araksya_ghazaryan.chapter_9;

class AnotherClient implements CallBack {
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}