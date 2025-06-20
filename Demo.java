public class Demo {
    public static void main(String[] args) {
        Logistics logistics;

        // Road logistics
        logistics = new RoadLogistics();
        logistics.planDelivery(); // Output: Delivering by land in a truck.

        // Sea logistics
        logistics = new SeaLogistics();
        logistics.planDelivery(); // Output: Delivering by sea in a ship.
    }
}