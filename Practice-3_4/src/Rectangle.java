public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width * width) + (height * height);
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}
