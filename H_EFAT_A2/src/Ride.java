import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class  Ride implements RideInterface {

    private int maxRider;
    private int numOfCycles;
    private final LinkedList<Visitor> rideHistory;

    @SuppressWarnings("rawtypes")
    public Ride(String name, int maxRider, boolean isOpen, Employee operator) {
        this.maxRider = maxRider;
        new LinkedList();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // Other methods from previous parts...
    // Setters and Getters for maxRider and numOfCycles
    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }
    

    // Method to import ride history from a file
    public void importRideHistory(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming the file format is consistent with Visitor.toString output
                String[] parts = line.split(", ");
                String name = parts[0].split(": ")[1];
                int age = Integer.parseInt(parts[1].split(": ")[1]);
                String contact = parts[2].split(": ")[1];
                String ridePreference = parts[3].split(": ")[1];
                boolean isVip = Boolean.parseBoolean(parts[4].split(": ")[1]);

                Visitor visitor = new Visitor(name, age, contact, ridePreference, isVip);
                rideHistory.add(visitor);
            }
            System.out.println("Ride history successfully imported from " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error processing file content: " + e.getMessage());
        }
    }

    @Override
    public int numberOfVisitors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @SuppressWarnings("override")
    public void printRideHistory() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printQueue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void runOneCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    


    }


    

