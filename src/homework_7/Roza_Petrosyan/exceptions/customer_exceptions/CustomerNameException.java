package homework_7.Roza_Petrosyan.exceptions.customer_exceptions;

public class CustomerNameException extends CustomerException{
    public CustomerNameException(){
        super("Customer name is not valid. Please specify correct name.");
    }
}
