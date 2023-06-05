package Queue.Leyla;

public class Person {
    protected String name;
    protected String surname;
    protected int ticketsQ;

    protected Person(String name, String surname, int ticketsQ) {
        this.name = name;
        this.surname = surname;
        this.ticketsQ = ticketsQ;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    protected int getTicketsQ() {
        return ticketsQ;
    }

    protected void setTicketsQ(int ticketsQ) {
        this.ticketsQ = ticketsQ;
    }
}
