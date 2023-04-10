package homework_5.Qnarik_Khachatryan.pizza;

public class Customer {
    private int number;
    private String name;

    Customer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

