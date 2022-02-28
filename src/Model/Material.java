package Model;

import java.time.LocalDate;

public abstract class Material implements Discount {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Material() {
    }

    public Material(String id, String name,int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    abstract double getAmount();
    abstract LocalDate getExpireDate();

}

