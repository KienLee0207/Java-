package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashSet;

public class Controller {
    public TextField txt;
    public Button btn;
    public TextArea print;
    Integer a;

    public boolean isSoNguyenTo(int x){
        int count = 0;
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
    public void submit(){
            String alert="Nhập 1 số lớn hơn 1";
            if(txt.getText().isEmpty()){
                print.setText(alert);
                return;
            } else{
                String str="";
                String input = txt.getText().trim();
                try {
                     a =Integer.parseInt(input);
                }catch (NumberFormatException e){
                    txt.setText("Chỉ được nhập số không được nhập kí tự");
                    return;
                }for (int i=2;i<a;i++){
                    if(this.isSoNguyenTo(i)){
                        str+=i +"\n";

                    }

                }
                print.setText(str);
            }

    }

}
