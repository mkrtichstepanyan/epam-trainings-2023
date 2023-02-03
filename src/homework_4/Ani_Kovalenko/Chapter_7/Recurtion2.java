package homework_4.Ani_Kovalenko.Chapter_7;

public class Recurtion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for(i=0; i<10; i++){
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}
