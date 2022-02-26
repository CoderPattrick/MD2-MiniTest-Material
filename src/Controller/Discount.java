package Controller;

public interface Discount<T> {
    double getRealMoney(T obj);
}
//Tạo 1 lớp quản lý vật liệu
//        Tạo mới 5 đối tượng bột, 5 đối tượng thịt

//        Nếu bột còn 2 tháng hết hạn thì giảm 40%, bột còn 4 tháng hết hạn thì giảm 20%, còn lại thì giảm 5%.
//        Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay
