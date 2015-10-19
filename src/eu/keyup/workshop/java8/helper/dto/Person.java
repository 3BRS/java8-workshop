package eu.keyup.workshop.java8.helper.dto;

public class Person {
    private final long id;
    private final String name;
    private final int age;
    private final boolean alive;

    public Person(long id, String name, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Person{" + id +
                ", " + name +
                ", " + age + " years" +
                ", " + (alive ? "alive" : "dead") +
                '}';
    }
}
