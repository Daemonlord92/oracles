package org.blitmatthew.entity;

public class Inventory {
    private Long id;
    private String productName;
    private Long quantity;
    private Double price;
    private String catagory;

    public Inventory() {}

    public Inventory(String productName, Long quantity, Double price, String catagory) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.catagory = catagory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inventory { ");
        sb.append(" id = ").append(id);
        sb.append(", productName = '").append(productName).append('\'');
        sb.append(", quantity = ").append(quantity);
        sb.append(", price = ").append(price);
        sb.append(", catagory = '").append(catagory).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
