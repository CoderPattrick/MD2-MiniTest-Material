package Controller;
import Model.Material;
import Model.Meat;
import java.time.*;
import java.util.LinkedList;



public class MeatManager extends MaterialManager {
    public static void setMeatInfo(LinkedList<Material> list, String id, String name, int cost, double weight,LocalDate localDate) {
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
}
//        Nếu thịt còn 5 ngày hết hạn thì giảm 30%, còn lại thì giảm 10%.