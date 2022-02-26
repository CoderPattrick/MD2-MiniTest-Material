package Model;
import java.time.LocalDate;

public class CrispyFlour extends Material {
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    private double quantity;

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount(){
        return quantity*getCost();
    }
    @Override
    public LocalDate getExpireDate(){
        LocalDate temp =getManufacturingDate();
        return LocalDate.of(temp.getYear()+1,temp.getMonth(),temp.getDayOfMonth());
    }
}
