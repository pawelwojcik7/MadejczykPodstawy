package org.example;

public class Publication {

    private String title;
    private String ident;
    private Double price;
    private Integer quantity;

    public Publication(String title, String ident, Double price, Integer quantity) {
        this.title = title;
        this.ident = ident;
        this.price = price;
        this.quantity = quantity;
    }

    public void buy(Integer n) {
        this.quantity = this.quantity + n;
    }

    public void raise(Double r) {
        this.price = this.price + this.price * r;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", ident='" + ident + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
