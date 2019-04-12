package Labss3_Threads;

public class Main {

    public static void main(String[] args) {
         subthread s1 = new subthread();
        System.out.println(s1.getName());
        s1.setName("myJavaThread");
        System.out.println(s1.getName());
        s1.run();
        System.out.println("chúc mừng");

    }
}
