package homework_8.Anushik_Gevorgyan.Interface;

class Client  implements CallBack{
    public void callback(int p){
        System.out.println("callback called whit" + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "  may also define other members, too.");
    }
}