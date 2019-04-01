package session5;

public class sanPham extends  TaoSanPham{
    int ID;
    String name;
    int price;
    int total;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
     sanPham(){
         System.out.println("đã tạo đối tượng SanPham");
     }

    public sanPham(int ID, String name, int price, int total) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.total = total;
    }
}
