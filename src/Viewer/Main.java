package Viewer;
import Model.*;
import Controller.*;
import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Material> listMaterials = new LinkedList<>();
        Material meat1 = new Meat("m1","beef",10000,100);
        Material meat2 = new Meat("m2","beef",11000,110);
        Material meat3 = new Meat("m3","pork",8000,80);
        Material meat4 = new Meat("m4","chicken",6000,40);
        Material meat5 = new Meat("m5","beef",12000,120);

        Material flour1 = new CrispyFlour("f1","JustFlour",3000,35);
        Material flour2 = new CrispyFlour("f2","JustFlour",4000,32);
        Material flour3 = new CrispyFlour("f3","JustFlour",3000,30);
        Material flour4 = new CrispyFlour("f4","JustFlour",3000,36);
        Material flour5 = new CrispyFlour("f5","JustFlour",3000,32);

        meat1.setManufacturingDate(LocalDate.of(2022,2,27));
        meat2.setManufacturingDate(LocalDate.of(2022,2,26));
        meat3.setManufacturingDate(LocalDate.of(2022,2,25));
        meat4.setManufacturingDate(LocalDate.of(2022,2,24));
        meat5.setManufacturingDate(LocalDate.of(2022,2,23));

        flour1.setManufacturingDate(LocalDate.of(2022,2,27));
        flour2.setManufacturingDate(LocalDate.of(2022,1,27));
        flour3.setManufacturingDate(LocalDate.of(2021,12,27));
        flour4.setManufacturingDate(LocalDate.of(2021,11,27));
        flour5.setManufacturingDate(LocalDate.of(2021,3,27));

        listMaterials.add(meat1);
        listMaterials.add(meat2);
        listMaterials.add(meat3);
        listMaterials.add(meat4);
        listMaterials.add(meat5);
        listMaterials.add(flour1);
        listMaterials.add(flour2);
        listMaterials.add(flour3);
        listMaterials.add(flour4);
        listMaterials.add(flour5);

        MaterialManager.displayAll(listMaterials);
        for (Material e:listMaterials
             ) {
            System.out.printf("The cost of %s with id %s is %f.\n",e.getName(),e.getId(),e.getRealMoney());
        }
    }
}
