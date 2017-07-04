package wad.hellocategories.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private Integer id;
    private String name;
    private List<Item> items;

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.items = new ArrayList<>();
    }

    public Category(String name) {
        this(null, name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
