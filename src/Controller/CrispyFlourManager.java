package Controller;
import Model.CrispyFlour;
import Model.Material;
import java.time.LocalDate;
import java.util.LinkedList;

public class CrispyFlourManager extends MaterialManager<CrispyFlour> implements Discount<CrispyFlour>{
    @Override
    public double getRealMoney(CrispyFlour obj) {
        // Nếu bột còn 2 tháng hết hạn thì giảm 40%,
        // bột còn 4 tháng hết hạn thì giảm 20%,
        // còn lại thì giảm 5%.
        LocalDate today = LocalDate.now();
        LocalDate expireDate = obj.getExpireDate();
        if(today.isBefore(expireDate)){
            int cnt =0;
            double discount;
            double cost = obj.getCost();
            while(today.isBefore(expireDate)){
                today=today.plusMonths(1);
                cnt++;
                if(cnt>4){
                    discount =  10/100;
                    return (1-discount)*cost;
                }
            }
            discount = 5/100;
            return (1-discount)*cost;
        }
        return 0;
    }

    public void setCrispyFlourInfo(LinkedList<Material> list, String id, String name, int cost, double quantity, LocalDate localDate) {
        for (Material element: list
        ) {
            if(element instanceof CrispyFlour){
                CrispyFlour element1 =(CrispyFlour) element;
                if(element1.getId().equals(id)){
                    element.setName(name);
                    element.setCost(cost);
                    ((CrispyFlour) element).setQuantity(quantity);
                    element.setManufacturingDate(localDate);
                    return;
                }
            }
        }
    }
}
