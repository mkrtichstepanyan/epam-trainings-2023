package homework_5.TatevKocharyan.pizza_palmetto;

import java.util.Objects;

public class Pizza {

    String pizzaName;
    String type;
    private String tomatoPaste;
    private String cheese;
    private String salami;
    private String bacon;
    private String garlic;
    private String corn;
    private String pepperoni;
    private String olives;
    private String pepper;
    int count;

    public Pizza(String pizzaName, String type, int count) {
        if (count>10){
            System.out.println("You can only order up to 10");
        }
        this.pizzaName = pizzaName;
        this.type = type;
        this.count = count;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTomatoPaste() {
        return tomatoPaste;
    }

    public void setTomatoPaste(String tomatoPaste) {
        this.tomatoPaste = tomatoPaste;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSalami() {
        return salami;
    }

    public void setSalami(String salami) {
        this.salami = salami;
    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
    }

    public String getGarlic() {
        return garlic;
    }

    public void setGarlic(String garlic) {
        this.garlic = garlic;
    }

    public String getCorn() {
        return corn;
    }

    public void setCorn(String corn) {
        this.corn = corn;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

    public String getOlives() {
        return olives;
    }

    public void setOlives(String olives) {
        this.olives = olives;
    }

    public String getPepper() {
        return pepper;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    void addIngredient(String ingredient) {

        switch (ingredient) {
            case "Tomato Paste":
                setTomatoPaste("Tomato Paste");
                break;
            case "Cheese":
                setCheese("Cheese");
                break;
            case "Salami":
                setSalami("Salami");
                break;
            case "Bacon":
                setBacon("Bacon");
                break;
            case "Garlic":
                setGarlic("Garlic");
                break;
            case "Corn":
                setCorn("Corn");
                break;
            case "Pepperoni":
                setPepperoni("Pepperoni");
                break;
            case "Olives":
                setOlives("Olives");
                break;
            case "Pepper":
                setPepper("Pepper");
                break;
        }
    }

    void makeMargarita() {
        setTomatoPaste("Tomato Paste");
        setPepper("Pepper");
        setGarlic("Garlic");
        setBacon("Bacon");
    }

    void makePepperoni() {
        setTomatoPaste("Tomato Paste");
        setCheese("Cheese");
        setSalami("Salami");
        setOlives("Olives");

    }

    void makeGreek() {
        setOlives("Olives");
        setCheese("Cheese");
        setGarlic("Garlic");
        setCorn("Corn");
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return count == pizza.count && Objects.equals(pizzaName, pizza.pizzaName) && Objects.equals(type, pizza.type) && Objects.equals(tomatoPaste, pizza.tomatoPaste) && Objects.equals(cheese, pizza.cheese) && Objects.equals(salami, pizza.salami) && Objects.equals(bacon, pizza.bacon) && Objects.equals(garlic, pizza.garlic) && Objects.equals(corn, pizza.corn) && Objects.equals(pepperoni, pizza.pepperoni) && Objects.equals(olives, pizza.olives) && Objects.equals(pepper, pizza.pepper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaName, type, tomatoPaste, cheese, salami, bacon, garlic, corn, pepperoni, olives, pepper, count);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", type='" + type + '\'' +
                ", tomatoPaste='" + tomatoPaste + '\'' +
                ", cheese='" + cheese + '\'' +
                ", salami='" + salami + '\'' +
                ", bacon='" + bacon + '\'' +
                ", garlic='" + garlic + '\'' +
                ", corn='" + corn + '\'' +
                ", pepperoni='" + pepperoni + '\'' +
                ", olives='" + olives + '\'' +
                ", pepper='" + pepper + '\'' +
                ", count=" + count +
                '}';
    }
}
