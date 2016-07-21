package entities;

/**
 * Created by Ari on 7/21/16.
 */
public class Product {

    private Long productId;
    private String name;
    private String descption;
    private double price;

    public Product (){

    }
    public Product (Long productId, String name, String description, double price){

    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescption() {
        return descption;
    }

    public void setDescption(String descption) {
        this.descption = descption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
