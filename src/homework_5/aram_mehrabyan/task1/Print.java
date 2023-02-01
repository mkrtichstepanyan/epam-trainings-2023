package homework_5.aram_mehrabyan.task1;

public class Print {
    public static void printNumbers(int count) {
        // Todo write your code here ...
        if(count<=0)
            return;
        printNumbers(count-1);
        System.out.println(count);
    }
}
class TestPrint{
    public static void main(String[] args) {
        Print prt=new Print();
        prt.printNumbers(10);

    }
}