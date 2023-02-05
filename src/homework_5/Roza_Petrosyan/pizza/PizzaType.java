package homework_5.Roza_Petrosyan.pizza;

public class PizzaType {
    private String[][] pizzaTypeList = {
            {"Regular", "1.0"}, {"Pizza Base (Calzone)", "1.5"}
    };

    public String getRegularType() {
        return pizzaTypeList[0][0];
    }

    public String getRegularPrice() {
        return pizzaTypeList[0][1];
    }

    public String getCalzoneType() {
        return pizzaTypeList[1][0];
    }

    public String getCalzonePrice() {
        return pizzaTypeList[1][1];
    }
}
