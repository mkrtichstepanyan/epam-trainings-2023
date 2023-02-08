package homework_5.TatevKocharyan.pizza_palmetto;

public class Pizza {
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

    public String getPepper() {
        return pepper;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    void addIngredient(Pizza pizza, String ingredient) {

        switch (ingredient) {
            case "Tomato Paste":
                pizza.setTomatoPaste("Tomato Paste");
                break;
            case "Chees":
                pizza.setCheese("Chees");
                break;
            case "Salami":
                pizza.setSalami("Salami");
                break;
            case "Bacon":
                pizza.setBacon("Bacon");
                break;
            case "Garlic":
                pizza.setGarlic("Garlic");
                break;
            case "Corn":
                pizza.setCorn("Corn");
                break;
            case "Pepperoni":
                pizza.setPepperoni("Pepperoni");
                break;
            case "Olives":
                pizza.setOlives("Olives");
                break;
            case "Pepper":
                pizza.setPepper("Pepper");
                break;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                ", type=" + type +
                ", tomatoPaste='" + tomatoPaste + '\'' +
                ", cheese='" + cheese + '\'' +
                ", salami='" + salami + '\'' +
                ", Bacon='" + bacon + '\'' +
                ", Garlic='" + garlic + '\'' +
                ", Corn='" + corn + '\'' +
                ", Pepperoni='" + pepperoni + '\'' +
                ", Olives='" + olives + '\'' +
                ", count=" + count +
                '}';
    }
}
