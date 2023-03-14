package homework_12.robert_nazaryan;

public class Main {
    private static final String TEST_TXT = "Test.txt";
    private static final String PHONE_NUMBERS_TXT = "phoneNumbers.txt";
    private static  final String LOREM ="Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
            " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took" +
            " a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries," +
            " but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the " +
            "1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop " +
            "publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    public static void main(String[] args) {
        FileProcessor file = new FileProcessor();
        file.writeFile(TEST_TXT, LOREM);
        System.out.println(file.processData(file.readFile(TEST_TXT)));
        file.readFile("text.txt");
        file.readFile("file.pdf");

        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.generatePhoneNumbers("093");
        phoneNumber.writeToFile(PHONE_NUMBERS_TXT);
    }
}