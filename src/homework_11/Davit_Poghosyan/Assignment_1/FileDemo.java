package homework_11.Davit_Poghosyan.Assignment_1;

public class FileDemo {
    public static void main(String[] args) {
        FileReaderWriter reader = new FileReaderWriter();
        String filePath = "C:\\Users\\Davit\\Desktop\\Davit_Epam\\epam-trainings-2023\\src\\homework_11\\Davit_Poghosyan\\testRead.txt";
        String filePath1 = "C:\\Users\\Davit\\Desktop\\Davit_Epam\\epam-trainings-2023\\src\\homework_11\\Davit_Poghosyan\\testWrite.txt";
        System.out.println(reader.ReadFile(filePath));
        reader.writeFile(filePath1, filePath);
    }
}
