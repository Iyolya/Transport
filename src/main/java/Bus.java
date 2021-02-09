import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;


    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();

    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public void addPassenger(Passenger passenger) {
        if (passengerCount() < getCapacity()){
        this.passengers.add(passenger);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}
