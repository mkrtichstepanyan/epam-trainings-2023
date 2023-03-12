package homework_10.Radik_Manasyan.imitationPersonRegister;

import homework_10.Radik_Manasyan.imitationPersonRegister.models.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        person.setName("Name of");
        person.setPhoneNumber("+374-77-12-34-56");
        person.setEmail("Radikmanasyan@gmail.com");
    }
}
