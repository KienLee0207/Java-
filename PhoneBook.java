package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public  class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList;

    @Override
    public void removePhone(String name) {
    for (PhoneNumber pn:this.PhoneList){
        if (pn.getName().equals(name)){
            this.PhoneList.remove(pn);
            System.out.println("done");

        }
    }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneNumber pn:this.PhoneList) {
            if (pn.getName().equals(name)) {
                pn.setPhone(newPhone);
                System.out.println("done");
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pn:this.PhoneList) {
            if (pn.getName().equals(name)) {
                System.out.println(pn.getName()+" "+pn.getPhone());
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(this.PhoneList,new Comparator<PhoneNumber>(){
            public int compare(PhoneNumber o1,PhoneNumber o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


    @Override
    public void insertPhone(String name, String Phone) {
        for (PhoneNumber pN:this.PhoneList){
            if (pN.getName().equals(name)){
                if(pN.getPhone().equals(Phone)){
                    System.out.println("đã tồn tại");
                    return;
                }
                pN.setPhone(pN.getPhone()+ ":" + Phone);
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name,Phone));
    }
}
