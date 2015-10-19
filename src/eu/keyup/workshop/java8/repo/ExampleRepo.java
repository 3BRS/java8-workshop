package eu.keyup.workshop.java8.repo;

import eu.keyup.workshop.java8.helper.Helper;
import eu.keyup.workshop.java8.helper.dto.Person;
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

        // java8

        // throws NoSuchElementException

        // or specific exception

        // ******************** get or default name ********************

        print(classicRepo.getOrDefault(999l, new Person(0l, "default name", 0, false)).getName());
        Person p = classicRepo.getOrNull(999l);
        if (p != null) {
            print(p.getName());
        } else {
            print("default name");
        }

        // java-8


    }

    private static void fill(Repo<Person> repo) {
        Helper.preparePeople().forEach(repo::store);
    }

    private static void print(String str) {
        System.out.println(str);
    }

}
