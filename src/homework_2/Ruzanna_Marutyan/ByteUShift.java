package homework_2.Ruzanna_Marutyan;
//Unsigned shifting a byte value.
class ByteUShift {
static public void main (String[] args) {
    char[] hex= {
            '0','1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e','f'
    };
    byte b=(byte) 0xf1;//1111 0001-> after caste to byte b=11110001=-15
    byte c=(byte) (b>>4);//
    //System.out.println("b= " + b);
    //System.out.println("c= " +c);
    byte d=(byte) (b>>>4);
    byte e=(byte) ((b & 0xff) >> 4);

    System.out.println("                  b = 0x"
            + hex[(b>>4) & 0x0f] +hex[b & 0x0f]);
    System.out.println("               b>>4 = 0x"
            + hex[(c>>4) & 0x0f] +hex[c & 0x0f]);
    System.out.println("              b>>>4 = 0x"
            + hex[(d>>4) & 0x0f] +hex[d & 0x0f]);
    System.out.println("      (b & 0xff)>>4 = 0x"
            + hex[(e>>4) & 0x0f] +hex[e & 0x0f]);
}
}
