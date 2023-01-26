package homework_2.Liana_Gevorgyan;
//Demonstrare several assignment operators
public class OpEquals {
    public static void main(String args[]){
        int a =1;
        int b=2;
        int c=3;
        a+=5;
        b*=4;
        c+=a*b;
        c %=6;
        System.out.println("a = " + a);
        System.out.printf("b= " + b);
        System.out.printf("c= " + c);

    }
}
