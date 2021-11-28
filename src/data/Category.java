package data;

import java.util.ArrayList;

public class Category {
    private String ID;
    private String name;
    private ArrayList<Product> products;

    public Category(String ID, String name) {
        this.ID = ID;
        this.name = name;
        products = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
