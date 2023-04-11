import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Haymarket", 3);
        person = new Person();
        busStop = new BusStop("Haymarket");

    }

    @Test
    public void busHasNoPassengers() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busHasPassengers() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void busCantAddMoreThan3Passengers() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void busRemovesPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickUpPassengers() {
        bus.addPassenger(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.queueCount());
    }


}