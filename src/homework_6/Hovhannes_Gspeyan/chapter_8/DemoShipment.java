package homework_6.Hovhannes_Gspeyan.chapter_8;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of Shipment1: " + vol);
        System.out.println("Weight of Shipment1: " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of Shipment2: " + vol);
        System.out.println("Weight of Shipment2: " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
