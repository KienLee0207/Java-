package Labss3_Threads;

import java.util.ArrayList;

class subthread extends Thread {
    ArrayList<Integer> songuyento = new ArrayList<>();
    boolean isSoNguyenTo(int x){
        int count =0;
        for (int i = 1;i <= x; i++){

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
      public void run() {
          int dem=10;
            for (int i=0;i<10;i++) {
                dem--;

         try {
                    for (int n=2;songuyento.size()<11;n++){
                        if(isSoNguyenTo(n)){
                            songuyento.add(n);
                            System.out.println("số nguyên tố:" +n);
                        }
                    }
                      Thread.currentThread().getName();
                      System.out.println(dem);
                      Thread.sleep(1500);
                  } catch (Exception e){}
              }
      }
}



