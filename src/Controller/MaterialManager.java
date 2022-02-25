package Controller;
import Model.Material;
import java.util.LinkedList;

public class MaterialManager<T> {
    public void addMaterial(LinkedList<T> list,T material){
        list.add(material);
    }
}
//Tạo 1 lớp quản lý vật liệu
//        Tạo mới 5 đối tượng bột, 5 đối tượng thịt
//
//        Viết lớp quản lý Vật liệu cho phép thêm sửa xóa vật liệu.
//
//        Nếu thịt còn 5 ngày hết hạn thì giảm 30%, còn lại thì giảm 10%.
//        Nếu bột còn 2 tháng hết hạn thì giảm 40%, bột còn 4 tháng hết hạn thì giảm 20%, còn lại thì giảm 5%.
//
//        Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay

