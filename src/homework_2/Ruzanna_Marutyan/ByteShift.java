package homework_2.Ruzanna_Marutyan;
//Left shifting a byte value.
class ByteShift {
    public static void main (String args[]) {
        byte a= 64, b;  //a=2^6 64=1000000
        int i;

        i=a<<2; //1000000 add 2 0= 100000000 or i=a*2*2=64*2*2=256
        b=(byte) (a<<2); //2^8=256
//Question!!! why b is 0
        System.out.println("original value of a: " +a);
        System.out.println("i = " + i +", b=" + b);
    }
}
