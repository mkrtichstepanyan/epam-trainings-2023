package homework_11.Liana_Gevorgyan.assignment_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a File name to read: ");
            String fileName = sc.nextLine();

            String fileContent = FileIOHelper.readFile(fileName);
            String processedData = FileIOHelper.processData(fileContent);
            FileIOHelper.writeFile(FileIOHelper.getNewFileName(fileName), processedData);
        } catch (Exception e) {
            System.out.println("Error occurred during processing :" + e.getMessage());
        }
    }
}
