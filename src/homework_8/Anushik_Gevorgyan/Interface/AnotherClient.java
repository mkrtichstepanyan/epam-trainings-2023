package homework_8.Anushik_Gevorgyan.Interface;

class AnotherClient implements CallBack {
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}