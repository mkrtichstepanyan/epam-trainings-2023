package homework_4.Aram_Mehrabyan.chapter7;

public class Fact {
    int fact(int n){
        int res;
        if(n==1)
            return 1;
        res=n*fact(n-1);
        return res;
    }
}
class Recursion{
    public static void main(String[] args) {
        Fact f=new Fact();
        System.out.println("Factorial of 5 is: "+f.fact(5));
    }
}
