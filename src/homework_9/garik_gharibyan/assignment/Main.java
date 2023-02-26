package homework_9.garik_gharibyan.assignment;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("Jack");
        customerDto.setEmail("Jack@gmail.com");
        customerDto.setDiscountRate(141);

        Validator validator = new Validator();

        for (Error error : validator.validate(customerDto)) {
            if (error != null) {
                System.out.println(error.getMessage());
            }
        }

    }
}
