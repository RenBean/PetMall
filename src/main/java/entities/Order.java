package entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Ari on 7/21/16.
 */
public class Order {

    private Long orderId;
    private LocalDate orderDate;
    private Long ownerId;
    private ArrayList products;

    public Order (){

    }
    public Order (Long orderId, LocalDate orderDate, Long ownerId, ArrayList products){

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public ArrayList getProducts() {
        return products;
    }

    public void setProducts(ArrayList products) {
        this.products = products;
    }
}
