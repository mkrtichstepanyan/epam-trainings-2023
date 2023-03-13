package homework_9.Anushik__Gevorgyan.annotationhomework;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("N");
        customerDto.setEmail("email@gmail.com");
        customerDto.setBirthday(LocalDate.of(2000,07,11));
        CustomerValidator customerValidator=new CustomerValidator();
        System.out.println(customerValidator.validate(customerDto));
    }

}
