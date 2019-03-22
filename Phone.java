package session6;

import javax.swing.*;

public abstract class Phone {
    public  abstract  void  insertPhone(String name, String Phone);
    public abstract void  removePhone(String name);
    public  abstract void  updatePhone(String name, String newPhone);
    public  abstract void  searchPhone(String name);
    public  abstract  void  sort();
}
