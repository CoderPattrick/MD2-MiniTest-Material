package Model;
import Controller.Discount;

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

    @Override
    public String toString() {
        return "CrispyFlour{" +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", manufacturingDate=" + getManufacturingDate() +
                ", cost=" + getCost() +
                ", quantity=" + quantity +
                '}';
    }

    public CrispyFlour(String id, String name, int cost, double quantity) {
        super(id, name, cost);
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
    @Override
    public double getRealMoney() {
        // Nếu bột còn 2 tháng hết hạn thì giảm 40%,
        // bột còn 4 tháng hết hạn thì giảm 20%,
        // còn lại thì giảm 5%.
        LocalDate today = LocalDate.now();
        LocalDate expireDate = getExpireDate();
        if(today.isBefore(expireDate)){
            int cnt =0;
            double discount,realCost;
            double cost = getCost();
            while(today.isBefore(expireDate)){
                today=today.plusMonths(1);
                cnt++;
                if(cnt>4){
                    discount =  5;
                    realCost = cost-discount*cost/100;
                    return realCost;
                }
            }
            cnt--;
            if(cnt<=2){
                discount=40;
            }
            else {
                discount = 20;
            }
            realCost = cost-discount*cost/100;
            return realCost;
        }
        return 0;
    }
}
