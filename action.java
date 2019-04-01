package sessiom7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class action implements QLSV {
    ArrayList<Student> listHs = new ArrayList<>();

    public action() {
        System.out.println("bắt đầu chương trình");

    }
    Scanner sc = new Scanner(System.in);

    void addStudent(){
        Student hs = new Student();

        while (hs.id == null) {
            System.out.println("nhập id học sinh: ");
            hs.id = sc.nextLine();
            if(listHs.size() > 0){
                for(Student hss : listHs){
                    if (hs.id == hss.id){
                        System.out.println("id trùng lặp! xin vui lòng nhập lại");
                        hs.id = null;
                        break;
                    }
                }
            }
        }

        System.out.println("nhập tên học sinh");
        hs.name = sc.nextLine();
        System.out.println("nhập tuổi học sinh");
        hs.age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập điểm trung bình: ");
        hs.gpa = sc.nextFloat();
        this.listHs.add(hs);

    }

    void editByID(){
        System.out.println("hãy nhập id: ");
        String id = sc.nextLine();
        if(listHs.size() > 0){
            for(Student hss : listHs){
                if (id == hss.id){
                    System.out.println("nhập tên học sinh: ");
                    hss.name = sc.nextLine();

                    System.out.println("nhập tuổi học sinh");
                    hss.age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("nhập địa chỉ của học sinh: ");
                    hss.adress = sc.nextLine();

                    System.out.println("nhập điểm trung bình: ");
                    hss.gpa = sc.nextFloat();
                    sc.nextLine();

                    break;
                }
            }
            System.out.println("không có học sinh nào id " +id);
        }
        else{
            System.out.println("không có học sinh nào, hãy nhập 1 học sinh mới");
            this.addStudent();
        }
    }

    void DeleteByID (){
        System.out.println("hãy nhập id: ");
        String id = sc.nextLine();
        if(listHs.size() > 0){
            for(Student hss : listHs){
                if (id == hss.id){
                    this.listHs.remove(hss);
                    return;
                }
            }
            System.out.println("không có học sinh nào id " +id);
            return;
        }
        System.out.println("chưa có học sinh nào");
    }

    void ShowList(){
        if(listHs.size() > 0){
            for(Student hss : listHs){
                System.out.println("\n id: " + hss.id + ",  họ và tên: " + hss.name);
                System.out.println("tuổi: "+ hss.age + ",  địa chỉ: " + hss.adress +",   điểm trung bình: "+hss.gpa);
            }
            return;
        }
        System.out.println("chưa có học sinh nào, vui lòng nhập học sinh mới");

    }


    @Override
    public void  sortByGpa() {
        Collections.sort(this.listHs, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  Float.compare(o1.gpa, o2.gpa);
            }
        });
    }

    @Override
    public void sortByName(){
        Collections.sort(this.listHs, new Comparator<Student>(){
            public int compare(Student o1, Student o2) {
                return o1.getNameString().compareTo(o2.getNameString());
            }
        });
    }
}
