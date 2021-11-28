package data;

import java.util.Date;

public class Product {
    private String id;
    private String name;
    private String description;
    private float price;
    private Date expirationD;
    private Category category;

    public Product(String id, String name, String description, float price, Date expirationD) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expirationD = expirationD;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getExpirationD() {
        return expirationD;
    }

    public void setExpirationD(Date expirationD) {
        this.expirationD = expirationD;
    }
}
