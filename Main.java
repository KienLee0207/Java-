package Assignment_3;


public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 =new Thread2();
        t2.start();
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               for (int i=1;i<50;i++){
                   try {
                       System.out.println("Thread3: "+i);
                       Thread.sleep(1000);
                   } catch (Exception e){}

               }
           }
       };
        Thread t3 = new Thread(runnable);
        t3.start();

    }
}
