package homework_5.Sofya_Ghazaryan.Task_Pizza.Impl;

import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl {
    private List<Pizza> pizzaList = new ArrayList<>();

    public void add(Pizza pizza) {
        pizzaList.add(pizza);
    }

}
