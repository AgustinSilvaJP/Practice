public class Dog{
    private String name;
    private String breed; //breed = raza;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getInfo(){
        return "Name: " + getName() + ", breed: " + getBreed();
    }
    public void putName(String name){
        this.name = name;
    }
    public void putBreed(String breed){
        this.breed = breed;
    }
}
