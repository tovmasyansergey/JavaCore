package chapter.chapter8.shpment;

public class DemoShipment{
    public static void main(String[] args) {
        Shipment shipment = new Shipment(3,4,5,6,6);
        System.out.println(shipment.volume());
        System.out.println(shipment.weight);
        System.out.println(shipment.cost);
    }
}
