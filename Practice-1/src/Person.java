public class Person {
    //attributes
    static int totalPersons = 0;
    int age;
    String name;

    //contructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        totalPersons++;
    }
    public Person(String name){
        this.name = name;
        age = 18;
        totalPersons++;
    }
    //methods
    public void printInfo(){
        System.out.printf("Person name: %s, age: %d\n", name, age);
    }
    //getters, setters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getPersonInfo(){
        return "name: " + getName() + ", age: " + getAge();
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
}
