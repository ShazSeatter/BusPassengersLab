import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue = new ArrayList<>();

    public BusStop(String name) {
        this.name = name;
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        Person personRemoved = null;
        if(hasPersonInQueue()) {
            personRemoved =  this.queue.remove(0);
        }
        return personRemoved;
    }

    public int queueCount() {
        return this.queue.size();
    }

    public boolean hasPersonInQueue() {
        return this.queueCount() > 0;
    }
}


