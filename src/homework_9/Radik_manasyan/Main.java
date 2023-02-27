package homework_9.Radik_manasyan;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("a88", "a@3.mail.ru",
                LocalDate.of(2016, 2, 25), 0);
        Validator.isValidate(person);

    }
}
