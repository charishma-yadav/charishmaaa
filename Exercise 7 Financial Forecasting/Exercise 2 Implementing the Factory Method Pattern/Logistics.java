public abstract class Logistics {
    // Factory Method
    public abstract Transport createTransport();

    public void planDelivery() {
        // Use the factory method to get an object
        Transport transport = createTransport();
        transport.deliver();
    }
}