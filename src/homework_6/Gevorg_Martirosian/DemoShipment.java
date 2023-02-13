package homework_6.Gevorg_Martirosian;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("volume of shipment1 equals: " + vol);
        System.out.println("weight of shipment1 equals: " + shipment1.weight);
        System.out.println("delivery price: $" + shipment1.cost);

        vol = shipment2.volume();
        System.out.println("volume of shipment2 equals: " + vol);
        System.out.println("weight of shipment2 equals: " + shipment2.weight);
        System.out.println("delivery price: $" + shipment2.cost);
    }
}
