package Queue.Leyla;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generateClients();
        Queue<Person> ride = new LinkedList<>(people);

        while (!ride.isEmpty()) {
            Person person = ride.poll();
            int ticketsQ = person.getTicketsQ();
            ticketsQ = ticketsQ - 1;
            person.setTicketsQ(ticketsQ);
            System.out.printf("%s %s прокатился на аттракционе\n", person.getName(), person.getSurname());
            System.out.println("Осталось билетиков:" + ticketsQ);
            if (ticketsQ > 0) {
                ride.offer(person);
            }
        }
    }

    protected static List<Person> generateClients() {
        return List.of(
                new Person("Alice", "Wonder", 5),
                new Person("Bunny", "Bugs", 4),
                new Person("Darth", "Vader", 3),
                new Person("Edward", "Scissorhands", 11),
                new Person("Bender", "Bending", 7));
    }
}
