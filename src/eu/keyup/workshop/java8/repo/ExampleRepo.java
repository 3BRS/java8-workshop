package eu.keyup.workshop.java8.repo;

import eu.keyup.workshop.java8.repo.classic.PersonClassicRepo;
import eu.keyup.workshop.java8.repo.java8.PersonJava8Repo;


public class ExampleRepo {

    public static void main(String[] args) {
        // init
        PersonClassicRepo classicRepo = new PersonClassicRepo();
        fill(classicRepo);
        PersonJava8Repo java8Repo = new PersonJava8Repo();
        fill(java8Repo);

        // ******************** get or exception ********************

        print(classicRepo.getOrThrow(1l).getName());

        // throws NoSuchElementException
        print(java8Repo.get(1l).get().getName());
        // or specific exception
        print(java8Repo.get(1l).orElseThrow(() -> new IllegalArgumentException("not found")).getName());

        // ******************** get or default name ********************

        print(classicRepo.getOrDefault(999l, new Person(0l, "default name", 0, false)).getName());
        Person p = classicRepo.getOrNull(999l);
        if (p != null) {
            print(p.getName());
        } else {
            print("default name");
        }

        // voila
        print(java8Repo.get(999l).map(Person::getName).orElse("default name"));

    }

    private static void fill(Repo<Person> repo) {
        repo.store(new Person(1l, "Jizicek", 2, true));
        repo.store(new Person(2l, "Jirka", 10, true));
        repo.store(new Person(3l, "Jirka Duchodce", 80, true));
        repo.store(new Person(4l, "Jirka Mrtvej", 80, false));
    }

    private static void print(String str) {
        System.out.println(str);
    }

}
