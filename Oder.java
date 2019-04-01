package session5;

import java.util.ArrayList;
import session5.Ao;
import  session5.Nhan;
public class Oder extends  sanPham{
    int ID,tongTien;

    public Oder(int ID, String name, int price, int total, int ID1, int tongTien, ArrayList ds) {
        super(ID, name, price, total);
        this.ID = ID1;
        this.tongTien = tongTien;
        this.ds = ds;
    }

    public int getID() {

        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    ArrayList ds = new ArrayList();
    Oder(){
        System.out.println("đã tạo đối tượng Order");
    }
    public Oder(int ID, int tongTien) {
        this.ID = ID;
        this.tongTien = tongTien;
    }
    public static void main(String[] args) {
        Oder n = new Oder();
        Ao ao = new Ao(2,"Ao1",2000,5,3,"đen",1);
        Nhan nhan = new Nhan(2,"nhan1",3000,5,500,2);
        System.out.println("Số áo còn trong kho :"+ao.total);
        System.out.println("Số nhẫn còn trong kho :"+nhan.total);
        System.out.println("Số nhẫn bạn mua :");

    }
}
