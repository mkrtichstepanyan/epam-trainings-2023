package homework_7.Shushanik_araqelyan_pizza.drink;

import homework_7.Shushanik_araqelyan_pizza.Product;

public  class Drink extends Product {
    public int price;

    public Drink(String name,int price,int quantity){
        super.name = name;
        this.quantity = quantity;
        this.price = price;


    }

    public double calculatePrice(){
      return price;
    }

    public static void main(String[] args) {
          Drink natural = new Drink("natural", 10,5);
    }




}