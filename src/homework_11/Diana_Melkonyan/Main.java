package homework_11.Diana_Melkonyan;

import java.util.List;

public class Main  {
    public static  String path= "C:\\Users\\37455\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\Diana_Melkonyan\\readFile.txt";

    public static void main(String[] args) {

        Process.writeFile(path, "Diana");
        System.out.println(Process.readFile(path));
        System.out.println(Process.processData("Diana"));


    }
}

