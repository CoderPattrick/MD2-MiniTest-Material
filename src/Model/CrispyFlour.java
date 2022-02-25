package Model;
import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;
    @Override
    double getAmount(){
        return quantity*getCost();
    }
    @Override
    LocalDate getExpireDate(){
        LocalDate temp =getManufacturingDate();
        return LocalDate.of(temp.getYear()+1,temp.getMonth(),temp.getDayOfMonth());
    }
}
