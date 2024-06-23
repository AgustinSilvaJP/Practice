import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Circle...");
        System.out.println("Type the radius of the circle:");
        Circle circle = new Circle(scan.nextDouble());

        System.out.printf("The area of the circle of radius %.2f is: %.2f\n", circle.getRadius(), circle.getArea());
        System.out.printf("The circunference of the circle is: %.2f\n", circle.getCircunference());
    }
}