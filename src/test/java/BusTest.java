import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Hell", 10);
        passenger = new Passenger();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busHasDestination(){
        assertEquals("Hell", bus.getDestination());
    }

    @Test
    public void cadAddPassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger(passenger);
        assertEquals(2, bus.passengerCount());


    }

}
