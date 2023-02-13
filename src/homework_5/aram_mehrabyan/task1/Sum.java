package homework_5.aram_mehrabyan.task1;

public class Sum {
    private int sum;
    public int sumNumbers(int n) {

        // Todo write your code here ...
       if(n==0)
           return 0;
       sum=n+sumNumbers(n-1);
        return sum;
    }
}
class TestSum{
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println("Sum: " + s.sumNumbers(3));
    }

}
