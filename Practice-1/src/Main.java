public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Agus", 23);

        Person p2 = new Person("Suga");
        p2.setAge(20);

        System.out.println(p1.getPersonInfo());
        p2.printInfo();
    }
}