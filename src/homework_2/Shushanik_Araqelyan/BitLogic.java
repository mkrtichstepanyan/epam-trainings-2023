package homework_2.Shushanik_Araqelyan;

public class BitLogic {

public static void main(String[] args) {
    String[] binary = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0 110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    };

    int a = 3;// 0+2+1
    int b = 6;// 4+2+0
    int c = a | b;
    int d = a & b;
    int e = a ^ b;
    int f = (~a & b) | (a & ~b);
    int g = ~a & 0 * 0;
    System.out.println(" а = " + binary[a]);
    System.out.println(" Ь =" + binary[b]);
    System.out.println(" alb =" + binary[c]);
    System.out.println(" а &Ь = " + binary[d]);
    System.out.println("а = " + binary[e]);
    System.out.println("~a&b l a &~b = " + binary[f]);
    System.out.println(" ~а =" + binary[g]);
}

    }



