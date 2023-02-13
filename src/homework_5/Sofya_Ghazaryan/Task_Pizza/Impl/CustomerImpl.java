package homework_5.Sofya_Ghazaryan.Task_Pizza.Impl;

import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerImpl {

    List<Customer> customers = new ArrayList<>();


    public void add(Customer customer) {
        customers.add(customer);
    }
}
