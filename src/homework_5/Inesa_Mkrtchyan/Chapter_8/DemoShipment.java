package homework_5.Inesa_Mkrtchyan.Chapter_8;


public class DemoShipment {
    public static void main(String[] args) {
        Shipment sh1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment sh2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = sh1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + sh1.weight);
        System.out.println("Shipping cost: $ " + sh1.cost);
        System.out.println();

        vol = sh2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + sh2.weight);
        System.out.println("Shipping cost: $ " + sh2.cost);
    }
}
