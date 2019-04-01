package session5;

public class Fashion extends sanPham {
    int size;
    String color;
    String ThuongHieu;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }
    public Fashion(int ID, String name, int price, int total, int size, String color, String thuongHieu) {
        super(ID, name, price, total);
        this.size = size;
        this.color = color;
        ThuongHieu = thuongHieu;
    }
}
