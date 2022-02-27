package Model;

import Controller.Discount;
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

    @Override
    public String toString() {
        return "Meat{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", manufacturingDate=" + getManufacturingDate() +
                ", cost=" + getCost() +
                ", weight=" + weight +
                '}';
    }

    public Meat(String id, String name, int cost, double weight) {
        super(id, name, cost);
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
    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        LocalDate expireDate = getExpireDate();
        if(today.isBefore(expireDate)){
            int cnt =0;
            double discount,realCost;
            double cost = getCost();
            while(!today.isEqual(expireDate)){
                today=today.plusDays(1);
                cnt++;
                if(cnt>5){
                    discount =  10;
                    realCost = cost-discount*cost/100;
                    return realCost;
                }
            }
            discount = 30;
            realCost = cost-discount*cost/100;
            return realCost;
        }
        return 0;
    }
}
