package homework_2.Ruzanna_Marutyan;
class OpBitEquals {
    public static void main (String[] args) {
        int a =1;
        int b =2;
        int c =3;

        a|= 4;//  a = a | 4  0001|0100=0101=5
        b>>=1;//  b=b>>1     0010>>1=0001=1
        c<<=1;//  c=c<<1     0011<<1=0110=6
        a^=c;//   a=a^c      0101^0110=0011=3

        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("c= " +c);

    }
}
