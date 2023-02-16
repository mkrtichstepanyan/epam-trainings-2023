package homework_6.Karen_Mikayelyan.chapter_8.multilevel;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is: " + vol);
        System.out.println("Weight of shipment1 is: " + shipment1.weight);
        System.out.println("Cost of shipment1 is: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is: " + vol);
        System.out.println("Weight of shipment2 is: " + shipment2.weight);
        System.out.println("Cost of shipment2 is: $" + shipment2.cost);
        System.out.println();
    }
}
