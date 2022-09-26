import java.util.ArrayList;

public class Order {
    public java.util.Date moment;
    public OrderStatus status;
    ArrayList<OrderItem> items;
    public Client client;
    
    public Order(java.util.Date date, OrderStatus status, Client client){
        this.moment = date;
        this.status = status;
        this.items = new ArrayList<>();
        this.client = client;
    }
    
    public void addItem(OrderItem orderItem){
        items.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        items.remove(orderItem);
    }

    public double total(){
        double total = 0;
        for (OrderItem item : items){
            total += item.subTotal();
        }
        return total;
    }
    @Override
    public String toString() {
        String items_as_str = "";
        for(OrderItem item : items) {
            items_as_str += String.format("%s, $%s, Quantity: %s, Subtotal: $%s\n", item.product.productName, item.product.productPrice, item.quantity, item.subTotal());
        }
        return String.format("Order moment: %s\nOrder status: %s\nClient: %s\nOrder items:\n%s\nTotal price: $%s\n", moment, status, client, items_as_str, total());
    }
}
