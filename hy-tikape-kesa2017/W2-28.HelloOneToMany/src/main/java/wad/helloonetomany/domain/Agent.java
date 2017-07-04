package wad.helloonetomany.domain;

public class Agent {

    private String id;
    private Agency agency;
    private String name;

    public Agent(String id, Agency agency, String name) {
        this.id = id;
        this.agency = agency;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
