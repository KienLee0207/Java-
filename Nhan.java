package session5;

import Lab2.NhanVien;

public class Nhan  extends  sanPham{
   int trongLuong;
   int Loai;

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getLoai() {
        return Loai;
    }

    public void setLoai(int loai) {
        Loai = loai;
    }

    public Nhan(int ID, String name, int price, int total, int trongLuong, int loai) {
        super(ID, name, price, total);
        this.trongLuong = trongLuong;
        Loai = loai;
    }
}
