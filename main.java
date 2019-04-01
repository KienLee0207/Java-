package sessiom7;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        action PP = new action();
        boolean keepRuning = true;
        int choosen = 111;
        while (keepRuning) {
            System.out.println("\n 1. Add student. \n" +
                    "2. Edit student by id.\n" +
                    " 3. Delete student by id. \n" +
                    "4. Sort student by gpa. \n" +
                    "5. Sort student by name. \n" +
                    "6. Show student. \n" +
                    "0. Exit.");
            System.out.println("hãy nhập số từ 0-6: ");
            choosen = sc.nextInt();

            switch(choosen){
                case 0 :
                    System.out.println("chương trình kết thúc!");
                    keepRuning = false;
                    break;
                case 1 :
                    PP.addStudent();
                    break;
                case 2 :
                    PP.editByID();
                    break;
                case 3 :
                    PP.DeleteByID();
                case 4 :
                    PP.sortByGpa();
                    break;
                case 5 :
                    PP.sortByName();
                    break;
                case 6 :
                    PP.ShowList();
                    break;
                default :
                    System.out.println("chỉ được nhập các số từ 0-6");
                    break;
            }
        }
    }
}
