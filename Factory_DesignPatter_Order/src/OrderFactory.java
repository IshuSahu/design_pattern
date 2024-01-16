public class OrderFactory {
    public Order createOrder(String orderType) {
        switch (orderType.toLowerCase()) {
            case "dinein":
                return new Interface.DineInOrder();
            case "takeout":
                return new Interface.TakeoutOrder();
            case "delivery":
                return new Interface.DeliveryOrder();
            default:
                throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
    }
}
