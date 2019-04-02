package ADF1;

public class Circle extends GeometricObject{
    Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public  Circle(){
        System.out.println("đã khởi tạo 1 Circle");
    }
    public  Circle(Double radius){

    }
    public double  getDimester(){
        return getDimester();
    }
    @Override
    public double getArea(){
        return this.radius*this.radius*3.14;
    }

    @Override
    public double getPermeter() {
        return this.radius*2*3.14;
    }

    ;
}

