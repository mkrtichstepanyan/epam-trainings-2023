package homework_2.Liana_Gevorgyan;
//demonstrate ++
public class IncDec {
    public static void main(String args[]){
        int a=1;//
         int b =2;
         int c;
         int d;
         c=++b;
         d=a++;
         c++;
        System.out.println("a = " +a);// value of a will be changed as 2 because of line 10
        System.out.println("b = " +b);// value of b vill be changed as 3 because of line 9
        System.out.println("c = "+ c);// and c will be equal 4 because of line 11
        System.out.println("d = " + d);
    }
}
