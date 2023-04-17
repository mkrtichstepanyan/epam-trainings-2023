package homework_16.anna_manukyan.deep_copy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Serialization {

    private static final String BASE_PATH = "src\\homework_16\\anna_manukyan\\deep_copy\\files\\User_copy.txt";
    private static StringBuilder userList = new StringBuilder();

    public static void write(User[] users) {
        for (User user : users) {
            if (user != null){
                userList.append(user.toString()+"\n");
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(BASE_PATH))) {
            bufferedWriter.write(userList.toString());
            System.out.println("Users list was created successfully!");
        } catch (IOException e) {
            System.out.println("Can not write users list in " + BASE_PATH + " name");
        }
    }
}
