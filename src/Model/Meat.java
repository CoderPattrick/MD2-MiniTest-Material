package Model;

import Controller.MaterialManager;
import org.w3c.dom.Node;

import java.time.LocalDate;

public class Meat extends Material {
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    private double weight;

    @Override
    public double getAmount() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpireDate() {
        LocalDate temp=getManufacturingDate().plusDays(7);
        return temp;
    }
}
