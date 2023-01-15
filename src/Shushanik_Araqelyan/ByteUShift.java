package Shushanik_Araqelyan;

public class ByteUShift {
public static void main(String[] args){
    char[] hex= {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f'
    };
    byte b = (byte )0xf1;
    byte с = ( byte) (b >> 4) ;
    byte d = (byte ) (b >>> 4 ) ;
    byte е = ( byte ) ( (b & 0x0f)>> 4 );
    System.out .println (" b = Ох"
            + hex [ (b>> 4) & 0x0f] + hex [b & 0x0f ] );
    System.out . println (" b >> 4 = Ох"
            + hex [ ( с >>>4) & 0x0f] + hex [с & 0x0f ] );
    System.out . println (" b >>> 4 = Ох"
            + hex [ (d >> 4) & 0x0f] + hex [d & 0x0f] );
    System. out . println (" (b & Oxff) >> 4 = Ох"
            + hex [ (е >> 4) & 0x0f ] + hex [е & 0x0f]);
}
}
