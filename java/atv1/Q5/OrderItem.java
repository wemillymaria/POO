
public class OrderItem {
    public int quantity;
    public double price;
    Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal() {
        return price;
    }
}
