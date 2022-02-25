package Model;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    @Override
    double getAmount() {
        return getCost()*weight;
    }

    @Override
    LocalDate getExpireDate() {
        LocalDate temp=getManufacturingDate().plusDays(7);
        return temp;
    }
}
