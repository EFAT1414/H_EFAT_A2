public class AssignmentTwo {
    public static void main(String[] args) {
        // Create an operator and visitors
        Employee operator = new Employee("Alice", 30, "123-456-7890", "Ride Operator", 2500);
        Visitor visitor1 = new Visitor("Bob", 25, "234-567-8901", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Charlie", 20, "345-678-9012", "Ferris Wheel", false);

        // Create a ride
        Ride ride = new Ride("Roller Coaster", 5, true, operator);

        // Add visitors to the queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);

        // Print the queue
        ride.printQueue();

        // Run one cycle
        ride.runOneCycle();

        // Print ride history
        ride.printRideHistory();

        // Check visitor from history
        boolean isInHistory = ride.checkVisitorFromHistory(visitor1);
        System.out.println("Is " + visitor1.getName() + " in history? " + isInHistory);
    }
}
