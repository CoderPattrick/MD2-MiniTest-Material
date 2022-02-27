package Controller;
import Model.CrispyFlour;
import Model.Material;
import java.time.LocalDate;
import java.util.LinkedList;

public class CrispyFlourManager extends MaterialManager {
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
