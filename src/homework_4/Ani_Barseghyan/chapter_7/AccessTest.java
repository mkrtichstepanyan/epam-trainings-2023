package homework_4.Ani_Barseghyan.chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.defA = 10;
        ob.pubB = 20;

        //ob.privC=100;

        ob.setC(100);
        System.out.println("a, b, and c: " + ob.defA + ", " + ob.pubB + ", " + ob.getC());
    }

}
