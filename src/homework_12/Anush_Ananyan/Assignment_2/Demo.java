package homework_12.Anush_Ananyan.Assignment_2;

public class Demo {
    public static void main(String[] args) {
        PhoneNumbers_NIO numbers = new PhoneNumbers_NIO();
        String [] phoneNumbers = numbers.generatePhoneNumbers("077");
        numbers.writeFile(phoneNumbers, "src/homework_12/Anush_Ananyan/Assignment_2/numbers.txt");
    }
}
