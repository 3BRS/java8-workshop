package eu.keyup.workshop.java8.repo.java8;

import eu.keyup.workshop.java8.helper.dto.Person;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonJava8Repo extends Java8Repo<Long, Person> {

    public PersonJava8Repo() {
        super(Person::getId);
    }

    public Collection<Person> findByAge(int age) {
        return getAll().stream()
                .filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
    }

    public Optional<Person> getByAge(int age) {
        return getAll().stream()
                .filter(person -> person.getAge() == age)
                .reduce((person1, person2) -> {
                    if (person1 != null && person2 != null && !Objects.equals(person1, person2)) {
                        throw new IllegalArgumentException("More then one person of this age");
                    }
                    return person1 != null ? person1 : person2;
                });
    }

}
