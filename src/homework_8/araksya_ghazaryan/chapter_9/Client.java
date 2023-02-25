package homework_8.araksya_ghazaryan.chapter_9;


class Client  implements CallBack{
    public void callback(int p){
        System.out.println("callback called whit" + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "  may also define other members, too.");
    }
}