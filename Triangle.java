import java.util.Scanner;

public class Triangle {
     public  int CanhA;
    public int CanhB;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int chieuDai;

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public  int chieuRong;

    public int getCanhA() {
        return CanhA;
    }

    public void setCanhA(int canhA) {
        CanhA = canhA;
    }

    public int getCanhB() {
        return CanhB;
    }

    public void setCanhB(int canhB) {
        CanhB = canhB;
    }

    public int getCanhC() {
        return CanhC;
    }

    public void setCanhC(int canhC) {
        CanhC = canhC;
    }

    int CanhC;
    public  void CanhTamGiac(){
        System.out.println("Cạnh a:"+CanhA);
        System.out.println("Cạnh b: "+CanhB);
        System.out.println("Cạnh c: " + CanhC);
    }
    public void TypeTriangle(){
        if(this.CanhA !=this.CanhB && this.CanhA !=this.CanhC && this.CanhB != this.CanhC ){
            System.out.println("Kiểu :Tam giác Thường ");
        } else if(this.CanhA==this.CanhB || this.CanhB==this.CanhC || this.CanhC== this.CanhA){
            System.out.println("Kiểu :Tam giác Cân");
        } else if(this.CanhA==this.CanhB && this.CanhB==this.CanhC){
            System.out.println("Kiểu : Tam giác Điều");
        }
    }
    public  float tinhChuViTamgiac()
    {
        int sum= this.CanhA+this.CanhB+this.CanhC;
        System.out.println("Chu vi tam giác:"+sum);
        return  sum;
    }
    public double dienTichTamgiac(){
        double p = (this.CanhA+this.CanhB+this.CanhC)/2;
       double S = Math.sqrt(p*(p-CanhA)*(p-CanhB)*(p-CanhC));
        System.out.println("Diện tích Tam giác: "+ S);
        return  S;
    }
    public  void Rectangle(){
        System.out.println("Chiều Dài hình chữ nhật:"+this.chieuDai);
        System.out.println("Chiều rộng hình chữ nhật: "+this.chieuRong);
    }
     public int dientichRectangle(){
        int S= this.chieuDai*this.chieuRong;
         return  S;
     }
     public  int chuViRectangle(){
        int P = (this.chieuDai+this.chieuRong)*2;
        return P;
     }
    public static void main(String[] args) {
        Triangle XetTamGiac = new Triangle();
        Triangle XetChuNhat = new Triangle();
        XetTamGiac.setCanhA(3);
        XetTamGiac.setCanhB(4);
        XetTamGiac.setCanhC(5);
        XetTamGiac.CanhTamGiac();
        XetTamGiac.TypeTriangle();
        XetTamGiac.tinhChuViTamgiac();
        XetTamGiac.dienTichTamgiac();
        XetChuNhat.setChieuDai(5);
        XetChuNhat.setChieuRong(7);
        XetChuNhat.Rectangle();
        System.out.println("Diện tích hình chữ nhật : "+XetChuNhat.dientichRectangle());
        System.out.println("Chu vi hình chữ nhật:"+ XetChuNhat.chuViRectangle());

    }
}