public class AssignmentTwo {
    public static void main(String[] args) {
       //create an Employee
        Employee operator = new Employee("Rotna", 32, "0424242498", "Student",1500);

        //create visitor
        Visitor visitor1 = new Visitor("Manal",22,"044256987","Jet Ski",true);
        Visitor visitor2 = new Visitor("Tamzid",23,"0421214321","Roller Coaster",true);

        //create Ride
        Ride ride1 = new Ride("Jet ski",2,true,operator);
        Ride ride2 = new Ride("Roller Coaster",20,true,null);
    }
}    