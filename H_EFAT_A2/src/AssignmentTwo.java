public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partFive();
    }

    public void partFive() {
        // Create a Ride object
        Employee operator = new Employee("Alice", 30, "123-456-7890", "Ride Operator", 3000);
        Ride ride = new Ride("Ferris Wheel", 4, true, operator);

        // Create Visitors and add them to the queue
        Visitor visitor1 = new Visitor("Charlie", 22, "123-456-7890", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Alice", 25, "234-567-8901", "Water Slide", false);
        Visitor visitor3 = new Visitor("Eve", 28, "345-678-9012", "Carousel", true);
        Visitor visitor4 = new Visitor("Bob", 20, "456-789-0123", "Ferris Wheel", true);
        Visitor visitor5 = new Visitor("Daisy", 24, "567-890-1234", "Bumper Cars", false);
        Visitor visitor6 = new Visitor("Frank", 26, "678-901-2345", "Merry-Go-Round", true);
        Visitor visitor7 = new Visitor("Grace", 21, "789-012-3456", "Roller Coaster", true);
        Visitor visitor8 = new Visitor("Henry", 23, "890-123-4567", "Water Slide", false);
        Visitor visitor9 = new Visitor("Ivy", 27, "901-234-5678", "Carousel", true);
        Visitor visitor10 = new Visitor("Jack", 29, "012-345-6789", "Ferris Wheel", true);

        // Add Visitors to the Queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        // Print all Visitors in the Queue
        System.out.println("\nVisitors in the queue before running the ride:");
        ride.printQueue();

        // Run one cycle
        ride.runOneCycle();

        // Print all Visitors in the Queue after one cycle
        System.out.println("\nVisitors in the queue after running one cycle:");
        ride.printQueue();

        // Print all Visitors in the Ride History
        System.out.println("\nVisitors in the ride history:");
        ride.printRideHistory();
    }
}
