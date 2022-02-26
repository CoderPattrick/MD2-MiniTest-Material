package Controller;
import Model.Material;
import java.util.LinkedList;

public class MaterialManager<T> {
    void addMaterial(LinkedList list,T material){
        list.add(material);
    };
    void removeMaterial(LinkedList<Material> list,String id){
        for (Material e: list
             ) {
            if(e.getId().equals(id)){
                list.remove(e);
                return;
            }
        }
    };
}


