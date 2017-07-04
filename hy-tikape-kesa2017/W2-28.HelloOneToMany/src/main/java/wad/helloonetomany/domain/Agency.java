package wad.helloonetomany.domain;

public class Agency {

    private Integer id;
    private String name;

    public Agency(String name) {
        this(null, name);
    }

    public Agency(Integer id, String name) {
        this.id = id;
        this.name = name;
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

}
