package homework_16.yeghia_ansuryan.chapter_20.properties;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();

        capitals.setProperty("Illinois", "Springfield");
        capitals.setProperty("Missouri", "Jefferson City");
        capitals.setProperty("California", "Olympia");
        capitals.setProperty("Washington", "Sacramento");
        capitals.setProperty("Indiana", "Indianapolis");

        Set<?> states = capitals.keySet();

        for (Object name : states) {
            System.out.println("The capital of " + name + " is " +
                    capitals.getProperty((String) name) + ".");
        }
        System.out.println();
        String str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is " + str + ".");

    }
}
