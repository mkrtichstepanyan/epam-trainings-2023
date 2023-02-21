package homework_2.Liana_Gevorgyan;
//Demonstrate bitwise logical operators

public class BitLogic {
    public static void main(String args[]){
        String binary []={ "0000", "0001", "0010","0011","0100", "0101", "0110", "0111,",
        "1000", "1001","1010","1011", "1100","1101","1110","1111"};
        int a = 3;// 0+2+1 or 0011 in binary
        int b =6; // 4+2+0 or 0110 in binary
        int c= a|b; //will be bit 1 if any of them is 1
        int d= a&b;//both should be 1, then value will be one, other cases O
        int e =a^b;//Only one operand must be one then it will be 1, else 0)
        int f=(~a & b)|(a & ~b); //~ will invert value like ) 001 will be 110
        System.out.println(    " a = " + binary[a]);
        System.out.println(    " b = " + binary[b]);
        System.out.println(    " a|b = " + binary[c]);
        System.out.println(    " a&b = " + binary[d]);
        System.out.println(    " a^b= " + binary[e]);
        System.out.println(    " ~a & b|a & ~b = " + binary[f]);

    }
}
