package homework_2.Ruzanna_Marutyan;
//Demonstrate several assignment operators.
 class OpEquals {
     public static void main (String[] args) {
         int a=1;
         int b=2;
         int c=3;

         a+=5;       //a=a+5 = 1+5=6
         b*=4;      //b=b*4  = 2*4=8
         c+=a*6;   //c=a*6+c = 6*6+3=39
         c%=6;     //c=c%6   = 39%6=3 (36:6=6, 39-36=3)

         System.out.println("a= " +a);
         System.out.println("b= " +b);
         System.out.println("c= " +c);
     }
}
