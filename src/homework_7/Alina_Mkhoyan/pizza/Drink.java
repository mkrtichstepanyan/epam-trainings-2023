package homework_7.Alina_Mkhoyan.pizza;

public class Drink extends Product {
    private double litre;

    public Drink(String name, double price, double litre, int quantity) {
        super(name, price, quantity);
        this.litre = litre;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public double calculatePrice() {
        return getPrice();
    }

    public void printProductDetails() {
        System.out.println(getName() + " (" + getLitre() + getPrice() + ")");
//        System.out.println("Price: $" + calculatePrice());
    }
}