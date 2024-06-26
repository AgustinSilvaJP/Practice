public class Circle {
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircunference(){
        return 2 * radius * Math.PI;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
