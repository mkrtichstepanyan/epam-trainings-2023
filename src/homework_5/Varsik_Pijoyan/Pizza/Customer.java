package homework_5.Varsik_Pijoyan.Pizza;

public class Customer {
    private String name;
    private int number;

    public Customer(String name){
        this.name = name;
        this.number = getCustomerNumber();

    }



    private int getCustomerNumber() {
        double num = Math.random() * 10000;
        return (int) num;
    }

    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }
}
