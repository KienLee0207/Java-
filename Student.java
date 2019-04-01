package sessiom7;

public class Student {
    String id;
    String name;
    int age;
    String adress;
    float gpa;

    public Student() {
        System.out.println("bạn vừa tạo ra 1 đối tượng học sinh!");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameString() {
        return name;
    }

    public void setNameString(String nameString) {
        this.name = nameString;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
