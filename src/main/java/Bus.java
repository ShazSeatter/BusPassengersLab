import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers = new ArrayList<>();

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (hasSpace()) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        if (hasSpace() && busStop.queueCount() > 0) {
            Person personRemoved = busStop.removePersonFromQueue();
            this.addPassenger(personRemoved);
        }


    }

    public boolean hasSpace() {
        return this.passengerCount() < this.capacity;
    }
}
