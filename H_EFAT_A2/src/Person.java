public  class Person{
    protected String name;
    protected  int age;

//Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
//print person information

    public void printInfo(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

}
