public class Employee extends Person{
    private String jobTitle;
    private double  salary;


//dfefault constructor
    public Employee(){
        super();
        this.jobTitle = "unknown";
        this.salary = 0.0;
    }

    // parametarized constructor

    public Employee(String name, int age, String contactNumber, String jobTitle, double salary){
        super(name, age, contactNumber);
        this.jobTitle = jobTitle;
        this.salary = salary;

    }
    //getter & setter

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    public  void setSalary(double salary){
        this.salary = salary;
    }
}