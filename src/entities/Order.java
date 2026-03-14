package entities;

import entities.enums.OrderStatus;
import org.w3c.dom.ls.LSOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    List<OrderItem> items = new ArrayList<>();

    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {}

    public Order( Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrders() {
        return items;
    }

    public void addItem (OrderItem item){
        items.add(item);
    }

    public void removeItem (OrderItem item){
        items.remove(item);
    }

    public double total () {
        double sum =0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public Client getClient() {
        return client;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(sdf1.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");

        sb.append("Client: ").append(client.getName()).append(" ");
        sb.append("(").append(sdf2.format(client.getBirthDate())).append(") - ");
        sb.append(client.getEmail()).append("\n");

        sb.append("Order items:\n");

        for (OrderItem item : items) {
             sb.append(item.getProduct().getName()).append(", ");
             sb.append("$").append(String.format("%.2f", item.getPrice())).append(", ");
             sb.append("Quantity: ").append(item.getQuantity()).append(", ");
             sb.append("Subtotal: $").append(String.format("%.2f", item.subTotal())).append("\n");
        }

        sb.append("Total price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
