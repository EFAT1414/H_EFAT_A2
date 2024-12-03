import java.util.ArrayList;
import java.util.List;

public class Ride implements RideInterface {
    // Instance variables
    private String rideName;
    private int capacity;
    private boolean isOpen;
    private Employee operator;
    private List<Visitor> queue;          // List to hold visitors in the queue
    private List<Visitor> rideHistory;    // List to track ride history

    // Default constructor
    public Ride() {
        this.rideName = "Unknown";
        this.capacity = 0;
        this.isOpen = false;
        this.operator = null;
        this.queue = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, int capacity, boolean isOpen, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.operator = operator;
        this.queue = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // Interface Methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println(visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println(visitor.getName() + " removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the queue:");
        for (Visitor visitor : queue) {
            System.out.println("- " + visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (!isOpen) {
            System.out.println("The ride is closed.");
            return;
        }
        System.out.println("Running one cycle of the ride...");
        int processedVisitors = Math.min(queue.size(), capacity);
        for (int i = 0; i < processedVisitors; i++) {
            Visitor visitor = queue.remove(0);
            System.out.println(visitor.getName() + " is riding!");
            addVisitorToHistory(visitor);
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println("- " + visitor.getName());
        }
    }
}
