public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partSix();
    }

    public void partSix() {
        // Create a Ride object
        Employee operator = new Employee("Bob", 35, "123-456-7890", "Operator", 3000);
        Ride ride = new Ride("Roller Coaster", 4, true, operator);

        // Create Visitors and add them to the ride history
        Visitor visitor1 = new Visitor("Alice", 25, "987-654-3210", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Charlie", 30, "654-321-0987", "Ferris Wheel", true);
        Visitor visitor3 = new Visitor("Daisy", 22, "456-789-0123", "Bumper Cars", false);
        Visitor visitor4 = new Visitor("Eve", 28, "123-456-7890", "Carousel", true);
        Visitor visitor5 = new Visitor("Frank", 35, "321-654-0987", "Water Slide", true);

        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Export ride history to a file
        String fileName = "ride_history.txt";
        ride.exportRideHistory(fileName);
    }
}
