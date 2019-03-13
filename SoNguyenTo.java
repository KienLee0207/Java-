
public class SoNguyenTo {
    public int a;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        if(this.isSoNguyenTo(a)){
            this.a = a;
        }
        else {
            System.out.println("Không set");
        }
    }
    SoNguyenTo(){
        System.out.println("tạo đối tương SNT");
    }
    SoNguyenTo(int x){
        if (this.isSoNguyenTo(x)) {
            this.a = x;
        }
        else {
            System.out.println(x + "  không phải số nguyên tố,không lưu trữ.");
        }

    }
    boolean isSoNguyenTo(int x){
        int count = 1;
        for (int i = 2;i <= x; i++){

            if (x%i==0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        else {
            return false;
        }
    }
    int timSoNguyenToTiepTheo(){
        int NextNumber = 0;


        for ( int i = this.getA() + 1 ; ; i++){

            if ( this.isSoNguyenTo(i) ){
                NextNumber = i;
                break;
            }
        }
        return NextNumber;
    }
    public static void main(String[] args) {
        SoNguyenTo soA = new SoNguyenTo();
        SoNguyenTo so2 = new SoNguyenTo(3);
        System.out.println(so2.getA());
        soA.setA(2);
        System.out.println(soA.isSoNguyenTo(2));
        System.out.println(so2.isSoNguyenTo(4));
        System.out.println(soA.getA());
        soA.setA(3);
        System.out.println(soA.getA());
        System.out.println("số nguyên tố tiếp theo của so2 ="+ so2.timSoNguyenToTiepTheo());
        so2.setA(5);
        System.out.println(so2.getA());
        System.out.println("số nguyên tố tiếp theo của so2 ="+ so2.timSoNguyenToTiepTheo());
    }
}


