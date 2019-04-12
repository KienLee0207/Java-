package Assignment_3;

public class Thread1 extends Thread {
    public void run(){
        for (int i=1;i<50;i++){
            try {
                System.out.println("Thread1: "+i);
                Thread.sleep(1000);
            } catch (Exception e){}

        }
    }
}
class Thread2 extends Thread{
    public  void run(){
        for (int i=1;i<50;i++){
            try {
                System.out.println("Thread2: "+i);
                Thread.sleep(1000);
            } catch (Exception e){}

        }
    }
}
class Thread3 implements Runnable{
    public void run(){

    }
}
