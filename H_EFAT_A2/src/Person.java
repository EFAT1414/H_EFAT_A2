public abstract class Person{
    private  String name;
    private  int age;
    private String contactNumber;
        //defalut constructor
    public Person(){
        this.name ="unknown";
        this.age = 0;
        this.contactNumber = "unknown";
    }

//Parametarized Constructor
    public Person(String name, int age, String contactNumber){
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }
    //getter & setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    

}
