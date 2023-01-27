package homework_2.Liana_Gevorgyan;
///The following program crates a few integer variables and then uses
// compound bitwise operator assignments to manipulate the variables
public class OpBitEquals {
    public static void main(String args[]){
        int a =1;
        int b=2;
        int c=3;
        a|=4;// will be performed as binary bitwise operation, it means a=1 will be converted to binary and 4 also
        //then since 0001(1) and 0100 (4) then bitwise |  (this logic also will apply for others value)
        b>>=1; // b will be converted to its binary value and will shift to right one position and b instead of 2
                //will have value as 1 which is for binary equal to 0001
        c<<=1;
        a^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
