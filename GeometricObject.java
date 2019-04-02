package ADF1;
import java.time.LocalDate;
import java.util.Date;
public abstract class GeometricObject {
    String color;
    Boolean filled;

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    LocalDate dateCreate =  LocalDate.now();
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public  abstract  double  getArea();
    public abstract double getPermeter();
    public  String toString(){
        this.dateCreate.toString();
        return  toString();
    }
}
