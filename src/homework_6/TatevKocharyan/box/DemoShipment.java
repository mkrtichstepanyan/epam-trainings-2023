package homework_6.TatevKocharyan.box;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volum();
        System.out.println("Volume of shipment is " + vol);
        System.out.println("Weight of shipment is " + shipment1.weight);
        System.out.println("Shipment cost: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volum();
        System.out.println("Volume of shipment is " + vol);
        System.out.println("Weight of shipment is " + shipment2.weight);
        System.out.println("Shipment cost: $" + shipment2.cost);

    }
}