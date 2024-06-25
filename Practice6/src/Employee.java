public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(){}
    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //methods
    public void raiseSalary(double porc){
        salary += salary * porc;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }
}
