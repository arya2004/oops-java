package org.labExam;

class Order {
    private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private static String status;

    static {
        status = "Ordered";
        System.out.println("Order status: " + status);
    }

    public Order(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
    }

    public double calculateTotalPrice(int unitPrice) {
        totalPrice = unitPrice + (unitPrice * 0.05);
        return totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static String getStatus() {
        return status;
    }
}



public class eleven {
    public static void main(String[] args) {
        // Creating an instance of the Order class
        Order order = new Order(101, "Burger");

        // Calculating the total price
        double calculatedPrice = order.calculateTotalPrice(35);

        // Displaying the order details
        System.out.println("Order Details:");
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Ordered Food: " + order.getOrderedFoods());
        System.out.println("Order status: " + Order.getStatus());
        System.out.println("Total Price: $" + calculatedPrice);
    }
}
