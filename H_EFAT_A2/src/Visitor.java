public  class Visitor extends Person {
//intense variable
private String favouriteRide;
private boolean hasSeasonalPass;

//default constructor

public Visitor(){
    super();
    this.favouriteRide = "unknown";
    this.hasSeasonalPass = false;
}

//parameatrized constructor

public Visitor (String name, int age, String contactNumber, String favouriteRide, boolean hasSeasonalPass){
    super(name, age, contactNumber);
    this.favouriteRide = favouriteRide;
    this.hasSeasonalPass = hasSeasonalPass;
}

 
//getter & setter
public String getFavouriteRide(){
    return  favouriteRide;
}
public void setFavouriteRide(String favouriteRide){
    this.favouriteRide = favouriteRide;
}
public boolean isHasSeasonalPass(){
    return hasSeasonalPass;
}
public void setHasSeasonalPass( boolean hasSeasonalPass){
    this.hasSeasonalPass = hasSeasonalPass;
    
    
}
}