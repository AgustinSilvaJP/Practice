public class Account {
    //atributos
    private String name;
    private int id;
    private double money;

    //constructores
    public Account(){}

    public Account(String name, int id, double money){
        this.name = name;
        this.id = id;
        this.money = money;
    }

    //methods
    public void deposit(double amount){
        if(amount >= 0) money += amount;
    }
    public void withdraw(double amount){
        if((money - amount) >= 0) money -= amount;
    }
    public String printInfo(){
        return "Account\nname: " + name + "\nID: " + id + "\nBalance: " + money;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getMoney(){
        return money;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setMoney(double money){
        this.money = money;
    }
}
