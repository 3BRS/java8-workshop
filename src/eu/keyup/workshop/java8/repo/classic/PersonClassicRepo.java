package eu.keyup.workshop.java8.repo.classic;

import eu.keyup.workshop.java8.helper.dto.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonClassicRepo extends ClassicRepo<Long, Person> {

    @Override
    public void store(Person person) {
        store(person.getId(), person);
    }

    public Collection<Person> findByAge(int age) {
        List<Person> people = new ArrayList<>();
        for (Person person : getAll()) {
            if (person.getAge() == age) {
                people.add(person);
            }
        }
        return people;
    }

    public Person getByAge(int age) {
        Collection<Person> people = findByAge(age);
        if (people.isEmpty()) {
            throw new IllegalArgumentException("No people of this age");
        } else if (people.size() > 1) {
            throw new IllegalArgumentException("More then one person of this age");
        } else {
            return people.iterator().next();
        }
    }
}
