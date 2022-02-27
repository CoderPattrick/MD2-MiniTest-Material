package Controller;
import Model.Material;
import java.util.LinkedList;

public class MaterialManager {
    public static void addMaterial(LinkedList<Material> list,Material material){
        list.add(material);
    };
    public static void removeMaterial(LinkedList<Material> list,String id){
        for (Material e: list
             ) {
            if(e.getId().equals(id)){
                list.remove(e);
                return;
            }
        }
    };
    public static void displayAll(LinkedList<Material> list){
        for (Material e:list
             ) {
            System.out.println(e);
        }
    }
}


