package wad.hellocategories.domain;

public class Item {

    private Integer id;
    private Category category;
    private String name;

    public Item(Integer id, Category category, String name) {
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public Item(Category category, String name) {
        this(null, category, name);
    }
    
    public Item(String name) {
        this(null, null, name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
