package homework_11.garik_gharibyan.assignment;


public class Main {
    public static void main(String[] args) {

        String readFile = "src/homework_11/garik_gharibyan/assignment/files/readFile.txt";
        String writeFile = "src/homework_11/garik_gharibyan/assignment/files/writeFile.txt";
        String phoneNumberFile = "src/homework_11/garik_gharibyan/assignment/files/phoneNumber.txt";

        if (!Validator.isValidFileName(readFile)){
            System.err.println("Invalid file type. name: " + readFile);
            System.exit(404);
        }

        String data = MyIO.readFile(readFile);
        System.out.println(data);

        String processData = MyIO.processData(data);
        System.out.println(processData);

        MyIO.writFile(writeFile, processData);


        String[] phoneNumbers = CreateNumber.generatePhoneNumbers("093");

        for (String number : phoneNumbers) {
            System.out.println(number);
        }
        MyIO.writePhoneNumber(phoneNumbers, phoneNumberFile);

    }
}
