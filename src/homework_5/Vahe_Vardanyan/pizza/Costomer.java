package homework_5.Vahe_Vardanyan.pizza;

public class Costomer {
    private String name;
    private int number;

    public Costomer(String name){
        this.name = name;
        this.number = addCostomerNumber();
    }
    private int addCostomerNumber() {
        double v = Math.random() * 100000;
        return (int) v;
    }
    public String getName(){
        return name;
    }
    public int getNumber() {
        return number;
    }


}
