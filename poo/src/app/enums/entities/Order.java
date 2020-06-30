package app.enums.entities;

import java.text.SimpleDateFormat;
import java.util.*;

import app.enums.entities.enums.OrderStatus;

/**
 * Order
 */
public class Order {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Integer id;
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itens = new ArrayList<>();

    public Order() {
    }

    public Order(Date date, OrderStatus status, Client client) {
        this.moment = date;
        this.status = status;
        this.client = client;
    }

    public Order(int id, Date date, OrderStatus status) {
        this.id = id;
        this.moment = date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void addItem(OrderItem orderItem) {
        this.itens.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        this.itens.remove(orderItem);
    }

    public double total() {

        double sum = 0.0;

        for (OrderItem item : itens) {

            sum += item.subTotal();

        }

        return sum;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items: ");
        for (OrderItem i : itens){
            sb.append(i.getProduct().getName());
            sb.append(", $");
            sb.append(i.getProduct().getPrice());
            sb.append(", Quantity: ");
            sb.append(i.getQuantity());
            sb.append(", Subtotal: $");
            sb.append(i.subTotal());
        }
        sb.append("Total: ");
        sb.append(total());
        return sb.toString();
    }

}