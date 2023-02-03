package homework_2.Hayk_Davtyan.Chapter_4;

public class BitLogic {
    public static void main(String[] args){
        String[] binar = {
          "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
          "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println("        a = " + binar[a]);
        System.out.println("        b = " + binar[b]);
        System.out.println("    a | b = " + binar[c]);
        System.out.println("      a&b = " + binar[d]);
        System.out.println("      a^b = " + binar[e]);
        System.out.println("~a&b|a&~b = " + binar[f]);
        System.out.println("       ~a = " + binar[g]);
    }
}
