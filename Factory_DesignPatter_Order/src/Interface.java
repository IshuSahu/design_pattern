public class Interface {
    static class DineInOrder extends Order {
        @Override
        public void processOrder() {
            System.out.println("Processing Dine-in Order");
            // Additional logic specific to Dine-in order processing
        }
    }

    // Concrete class representing a Takeout order
    static class TakeoutOrder extends Order {
        @Override
        public void processOrder() {
            System.out.println("Processing Takeout Order");
            // Additional logic specific to Takeout order processing
        }
    }

    // Concrete class representing a Delivery order
    static class DeliveryOrder extends Order {
        @Override
        public void processOrder() {
            System.out.println("Processing Delivery Order");
            // Additional logic specific to Delivery order processing
        }
    }
}
