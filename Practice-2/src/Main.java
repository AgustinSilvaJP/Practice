import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.setName(uwu.nextLine());
        d1.setBreed(uwu.nextLine());
        System.out.println(d1.getInfo());

        System.out.println();

        d2.setName(uwu.nextLine());
        d2.setBreed(uwu.nextLine());
        System.out.println(d2.getInfo());
    }
}