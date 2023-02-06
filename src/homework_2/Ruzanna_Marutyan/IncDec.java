package homework_2.Ruzanna_Marutyan;
//Demonstrate ++.
class IncDec {
    public static void main (String args[]) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c=++b;//c=b+1=2+1 c=3 b=3
        d=a++;//d=a+1=1+1 d=1 a=2
        c++; //c=c+1 =4
        System.out.println("a= " + a); //a=2
        System.out.println("b= " + b); //b=3
        System.out.println("c= " + c); //c=4
        System.out.println("d= " + d); //d=1
    }
}
