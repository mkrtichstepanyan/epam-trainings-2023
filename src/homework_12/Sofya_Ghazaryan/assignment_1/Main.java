package homework_12.Sofya_Ghazaryan.assignment_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Hp\\Desktop\\RD\\epam-trainings-2023\\src\\homework_12\\Sofya_Ghazaryan\\assignment_1\\Text.txt";

        ReadAndWrite.write(fileName, "Hello from Main!!!");
        System.out.println(ReadAndWrite.read(fileName));
        System.out.println(ReadAndWrite.processData(ReadAndWrite.read(fileName)));

    }
}
