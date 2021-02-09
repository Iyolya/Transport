import java.util.ArrayList;

public class Bus {
    private String destination;
    private ArrayList<Passenger> passengers;
    private int capacity;

    public Bus(String destination, int i) {
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.capacity = capacity;
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
