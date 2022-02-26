package Controller;
import Model.Material;
import Model.Meat;
import java.time.*;
import java.util.LinkedList;



public class MeatManager extends MaterialManager<Meat> implements Discount<Meat>{
    public void setMeatInfo(LinkedList<Material> list, String id, String name, int cost, double weight,LocalDate localDate) {
        for (Material element: list
             ) {
            if(element instanceof Meat){
                Meat element1 =(Meat) element;
                if(element1.getId().equals(id)){
                    element.setName(name);
                    element.setCost(cost);
                    ((Meat) element).setWeight(weight);
                    element.setManufacturingDate(localDate);
                    return;
                }
            }
        }
    }

    @Override
    public double getRealMoney(Meat obj) {
        LocalDate today = LocalDate.now();
        LocalDate expireDate = obj.getExpireDate();
        if(today.isBefore(expireDate)){
            int cnt =0;
            double discount;
            double cost = obj.getCost();
            while(!today.isEqual(expireDate)){
                today=today.plusDays(1);
                cnt++;
                if(cnt>5){
                    discount =  10/100;
                    return (1-discount)*cost;
                }
            }
            discount = 30/100;
            return (1-discount)*cost;
        }
        return 0;
    }
}
//        Nếu thịt còn 5 ngày hết hạn thì giảm 30%, còn lại thì giảm 10%.