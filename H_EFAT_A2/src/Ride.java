public class Ride {

    private String rideName;
    private int capacity;
    private boolean isOpen;
    private Employee operator; //employee assinged to operate the ride

//default constructor
    public Ride (){
        this.rideName = "unknown";
        this.capacity = 0;
        this.isOpen = false;
        this.operator = null;
    }
//parametarized constructor
public Ride ( String rideName, int capacity, boolean isOpen, Employee operator){
       this.rideName = rideName;
       this.capacity = capacity;
       this.isOpen = isOpen;
       this.operator = operator;     
}
//getter & setter
public String getRideName(){
    return rideName;
}
public void setRideName(String rideName){
    this.rideName = rideName;

}
public int getCapacity(){
    return capacity;
}
public void  setCapacity(int capacity ){
    this.capacity = capacity;
}
public boolean getIsOpen(){
    return isOpen;
}
public void setIsOpen(boolean isOpen){
    this.isOpen = isOpen;
}
public Employee getOperator(){
    return  operator;
}
public void setOperator (Employee operator){
    this.operator = operator;
}
}