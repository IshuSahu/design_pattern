public class OrderProcessingClient {
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();

        // Creating a Dine-in order
        Order dineInOrder = orderFactory.createOrder("dinein");
        dineInOrder.processOrder();

        // Creating a Takeout order
        Order takeoutOrder = orderFactory.createOrder("takeout");
        takeoutOrder.processOrder();

        // Creating a Delivery order
        Order deliveryOrder = orderFactory.createOrder("delivery");
        deliveryOrder.processOrder();
    }
}