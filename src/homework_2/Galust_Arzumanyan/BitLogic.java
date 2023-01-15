package homework_2.Galust_Arzumanyan;

//This method is used to demonstrate bitwise logical operators
class BitLogic {
    public static void main(String[] args) {
        String[] binary_array = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 1; // 0 + 0 + 0 + 1 - 0001
        int b = 2; // 0 + 0 + 1 + 0 - 0010
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("a is " + binary_array[a]);
        System.out.println("b is " + binary_array[b]);
        System.out.println("a | b is " + binary_array[c]);
        System.out.println("a & b is " + binary_array[d]);
        System.out.println("a ^ b is " + binary_array[e]);
        System.out.println("(~a & b) | (a & ~b) is " + binary_array[f]);
        System.out.println("~a & 0x0f is " + binary_array[g]);


    }
}
