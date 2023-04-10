package homework_12.Nona_Asatryan.nioTasks.assignment_2;

public class PhoneNumbersDemo {
    public static void main(String[] args) {
        String fileName = "/Users/nona.asatryan/epam-trainings-2023/src/homework_12/Nona_Asatryan/nioTasks/assignment_2/phoneNumber.txt";

        GeneratePhoneNumbers phn = new GeneratePhoneNumbers();
        String[] phoneNumbers = phn.generatePhoneNumbers("093");
        phn.writeToFile(phoneNumbers, fileName);
    }
}
