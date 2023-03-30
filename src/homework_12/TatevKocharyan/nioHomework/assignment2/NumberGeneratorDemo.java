package homework_12.TatevKocharyan.nioHomework.assignment2;

public class NumberGeneratorDemo {
    public static void main(String[] args) {
        String[] strings = PhoneNumberGenerator.generatePhoneNumbers("093");
        String fileName = "C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\text.txt";
        PhoneNumberGenerator.writeToFile(strings,fileName);
    }
}
