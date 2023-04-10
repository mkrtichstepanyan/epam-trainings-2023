package homework_9.Radik_manasyan;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        PersonDTO personDTO = new PersonDTO("Alisa", "a3.mail.ru",
                LocalDate.of(2000, 2, 25), 110);
        PersonValidator validator = new PersonValidator();
        System.out.println(validator.isValidate(personDTO));

    }
}
