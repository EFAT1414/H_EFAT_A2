public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partFourA();
    }

    public void partFourA() {
        // Create a Ride object
        Employee operator = new Employee("Alice", 30, "123-456-7890", "Ride Operator", 3000);
        Ride ride = new Ride("Ferris Wheel", 5, true, operator);

        // Create Visitors
        Visitor visitor1 = new Visitor("Bob", 25, "234-567-8901", "Ferris Wheel", true);
        Visitor visitor2 = new Visitor("Charlie", 20, "345-678-9012", "Roller Coaster", false);
        Visitor visitor3 = new Visitor("Daisy", 22, "456-789-0123", "Water Slide", true);
        Visitor visitor4 = new Visitor("Eve", 19, "567-890-1234", "Carousel", false);
        Visitor visitor5 = new Visitor("Frank", 28, "678-901-2345", "Ferris Wheel", true);

        // Add Visitors to Ride History
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Check if a Visitor is in the history
        ride.checkVisitorFromHistory(visitor3);
        ride.checkVisitorFromHistory(new Visitor("George", 30, "890-123-4567", "Bumper Cars", false));

        // Print the number of Visitors in the history
        System.out.println("Total Visitors in Ride History: " + ride.numberOfVisitors());

        // Print the Ride History
        ride.printRideHistory();
    }
}
