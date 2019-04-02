package ADF1;

public class Rectangle  extends   GeometricObject{
    Double width;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    Double height;

    @Override
    public double getArea(){
        return this.height*this.width;
    }

    @Override
    public double getPermeter() {
    return (this.height+this.width)*2;
    }


}
