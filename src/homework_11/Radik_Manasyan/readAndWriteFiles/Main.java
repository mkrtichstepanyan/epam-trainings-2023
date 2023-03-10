package homework_11.Radik_Manasyan.readAndWriteFiles;

import homework_11.Radik_Manasyan.phoneNumbers.GeneratePhoneNumbers;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/radik/IdeaProjects/epam-trainings-2023/src/homework_11/Radik_Manasyan/readAndWriteFiles/test.txt";
        String outPath = "/home/radik/IdeaProjects/epam-trainings-2023/src/homework_11/Radik_Manasyan/readAndWriteFiles/copyFile.txt";
        String phoneNumbers = "/home/radik/IdeaProjects/epam-trainings-2023/src/homework_11/Radik_Manasyan/phoneNumbers/phoneNumbers.txt";


        String text = IO.readFile(filePath);
        System.out.println(text);
        String data = IO.processData(text);
        System.out.println(data);
        IO.writeFile(outPath, filePath);

        String[] generatePhoneNumbers = GeneratePhoneNumbers.generatePhoneNumbers("093");
        GeneratePhoneNumbers.writeToFile(generatePhoneNumbers, phoneNumbers);

    }
}
