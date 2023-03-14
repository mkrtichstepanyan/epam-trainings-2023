package homework_11.Anush_Ananyan.Assignment_2;

public class Main {
    public static void main(String[] args) {

        PhoneNumber numbers = new PhoneNumber();
        String [] phoneNumbers= numbers.generatePhoneNumbers("094");

        numbers.writeFile(phoneNumbers,"src/homework_11/Anush_Ananyan/Assignment_2/numbers.txt" );
    }
}
