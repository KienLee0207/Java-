package session5;

public class Ao  extends sanPham{
    int size;
    String color;
    int thuongHieu;

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

    public int getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(int thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public Ao(int ID, String name, int price, int total, int size, String color, int thuongHieu) {
        super(ID, name, price, total);
        this.size = size;
        this.color = color;
        this.thuongHieu = thuongHieu;
    }
}
