package session5;

public class Jewelry extends sanPham {
     int trongLuong;

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    int loai;

    public Jewelry(int trongLuong, int loai) {
        this.trongLuong = trongLuong;
        this.loai = loai;
    }

    public Jewelry(int ID, String name, int price, int total, int trongLuong, int loai) {
        super(ID, name, price, total);
        this.trongLuong = trongLuong;
        this.loai = loai;
    }
}
