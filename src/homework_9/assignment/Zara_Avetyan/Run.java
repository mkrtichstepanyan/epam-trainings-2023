package homework_9.assignment.Zara_Avetyan.Homework;

import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Customer;

import java.time.LocalDate;

public class Run {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("Zara",
                "zara.avetyan.2004@mail.ru",
                LocalDate.of(2004, 4, 23),
                50);
        Validator validator = new Validator(customerDto);
        Errors.print();
    }
}