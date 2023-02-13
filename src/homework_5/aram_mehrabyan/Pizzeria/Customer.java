package homework_5.aram_mehrabyan.Pizzeria;

public class Customer {
    private final String customerName;
    private final   int customerId;
    public Customer(String customerName){
        this.customerName=customerName;
        this.customerId=(int) (Math.random()*10000);
    }
    public String getCustomerName(){
        return customerName;
    }
public int getCustomerId () {return  customerId;}
}
