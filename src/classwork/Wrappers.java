package classwork;


// autoboxing and unboxing
public class Wrappers {

    private static Byte aByte = Byte.valueOf("127");
    private static Short aShort = Short.valueOf("5");
    private static Integer integer = Integer.valueOf("5");
    private static Long aLong = Long.valueOf("1000");
    private static Double aDouble = Double.valueOf("5.0");
    private static Float aFloat = Float.valueOf("5.0");


    private static Character character = Character.valueOf('c');
    private static Boolean aBoolean = new Boolean(false);

    public static void main(String[] args) {
        System.out.println(aBoolean);
    }
}
