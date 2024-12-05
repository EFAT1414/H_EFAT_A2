public class AssignmentTwo {
    public static void main(String[] args) {
        // Code for testing the various parts can be added here
        AssignmentTwo assignment = new AssignmentTwo();
        
        // Example calls to the methods
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

   
    public void partThree() {
        // Create a Ride object
        Employee operator = new Employee("Habiba", 30, "123-456-7890", "Ride Operator", 3000);
        Ride ride = new Ride("Roller Coaster", 5, true, operator);

        // Create Visitors
        Visitor visitor1 = new Visitor("Marley", 25, "234-567-8901", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Steven", 20, "345-678-9012", "Ferris Wheel", false);
        Visitor visitor3 = new Visitor("Dylan", 22, "456-789-0123", "Water Slide", true);
        Visitor visitor4 = new Visitor("Elon mask", 19, "567-890-1234", "Carousel", false);
        Visitor visitor5 = new Visitor("Frank Sinatra", 28, "678-901-2345", "Roller Coaster", true);

        // Add Visitors to the Queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // Remove one Visitor from the Queue
        ride.removeVisitorFromQueue(visitor3);

        // Print the current Queue
        ride.printQueue();
    }
    
    public void partFourA() {
        // Create a Ride object
        Employee operator = new Employee("Habiba", 30, "123-456-7890", "Ride Operator", 3000);
        Ride ride = new Ride("Ferris Wheel", 5, true, operator);

        // Create Visitors
        Visitor visitor1 = new Visitor("Marley", 25, "234-567-8901", "Ferris Wheel", true);
        Visitor visitor2 = new Visitor("Steven", 20, "345-678-9012", "Roller Coaster", false);
        Visitor visitor3 = new Visitor("Dylan", 22, "456-789-0123", "Water Slide", true);
        Visitor visitor4 = new Visitor("Elon mask", 19, "567-890-1234", "Carousel", false);
        Visitor visitor5 = new Visitor("Frank Sinatra", 28, "678-901-2345", "Ferris Wheel", true);

        // Add Visitors to Ride History
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Check if a Visitor is in the history
        ride.checkVisitorFromHistory(visitor3);
        ride.checkVisitorFromHistory(new Visitor("Manal", 30, "890-123-4567", "Bumper Cars", false));

        // Print the number of Visitors in the history
        System.out.println("Total Visitors in Ride History: " + ride.numberOfVisitors());

        // Print the Ride History
        ride.printRideHistory();
    } 
    public void partFourB() {
        // Create a Ride object
        Employee operator = new Employee("Habiba", 30, "123-456-7890", "Ride Operator", 3000);
        Ride ride = new Ride("Ferris Wheel", 5, true, operator);

        // Create Visitors
        Visitor visitor1 = new Visitor("Steven", 22, "123-456-7890", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Habiba", 25, "234-567-8901", "Water Slide", false);
        Visitor visitor3 = new Visitor("Elon Mask", 28, "345-678-9012", "Carousel", true);
        Visitor visitor4 = new Visitor("Marley", 20, "456-789-0123", "Ferris Wheel", true);
        Visitor visitor5 = new Visitor("Dylan", 24, "567-890-1234", "Bumper Cars", false);

        // Add Visitors to Ride History
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Print unsorted Ride History
        System.out.println("\nUnsorted Ride History:");
        ride.printRideHistory();

        // Sort the Ride History
        ride.printRideHistory();

        // Print sorted Ride History
        System.out.println("\nSorted Ride History:");
        ride.printRideHistory();
    }
    public void partFive() {
        // Create a Ride object
        Employee operator = new Employee("Habiba", 30, "123-456-7890", "Ride Operator", 3000);
        Ride ride = new Ride("Ferris Wheel", 4, true, operator);

        // Create Visitors and add them to the queue
        Visitor visitor1 = new Visitor("Steven", 22, "123-456-7890", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Manal", 25, "234-567-8901", "Water Slide", false);
        Visitor visitor3 = new Visitor("lon Mask", 28, "345-678-9012", "Carousel", true);
        Visitor visitor4 = new Visitor("Marley", 20, "456-789-0123", "Ferris Wheel", true);
        Visitor visitor5 = new Visitor("Dylan", 24, "567-890-1234", "Bumper Cars", false);
        Visitor visitor6 = new Visitor("Frank Sinatra", 26, "678-901-2345", "Merry-Go-Round", true);
        Visitor visitor7 = new Visitor("Grace", 21, "789-012-3456", "Roller Coaster", true);
        Visitor visitor8 = new Visitor("Henry", 23, "890-123-4567", "Water Slide", false);
        Visitor visitor9 = new Visitor("Ivy Jack", 27, "901-234-5678", "Carousel", true);
        Visitor visitor10 = new Visitor("Jai", 29, "012-345-6789", "Ferris Wheel", true);

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
    public void partSix() {
        // Create a Ride object
        Employee operator = new Employee("Marley", 35, "123-456-7890", "Operator", 3000);
        Ride ride = new Ride("Roller Coaster", 4, true, operator);

        // Create Visitors and add them to the ride history
        Visitor visitor1 = new Visitor("Habiba", 25, "987-654-3210", "Roller Coaster", true);
        Visitor visitor2 = new Visitor("Steven", 30, "654-321-0987", "Ferris Wheel", true);
        Visitor visitor3 = new Visitor("Dylan", 22, "456-789-0123", "Bumper Cars", false);
        Visitor visitor4 = new Visitor("Elon Mask", 28, "123-456-7890", "Carousel", true);
        Visitor visitor5 = new Visitor("Frank Sinatra", 35, "321-654-0987", "Water Slide", true);

        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Export ride history to a file
        String fileName = "ride_history.txt";
        ride.importRideHistory(fileName);
    }

    public void partSeven() {
        // Create a Ride object
        Employee operator = new Employee("Marley", 35, "123-456-7890", "Operator", 3000);
        Ride ride = new Ride("Roller Coaster", 4, true, operator);

        // Import ride history from the file created in Part 6
        String fileName = "ride_history.txt";
        ride.importRideHistory(fileName);

        // Print the number of Visitors in the LinkedList
        System.out.println("Number of Visitors in the ride history: " + ride.numberOfVisitors());

        // Print all Visitors in the LinkedList
        ride.printRideHistory();
    }
}
