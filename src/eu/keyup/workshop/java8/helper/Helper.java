package eu.keyup.workshop.java8.helper;

import eu.keyup.workshop.java8.helper.dto.Person;
import eu.keyup.workshop.java8.helper.dto.User;
import eu.keyup.workshop.java8.helper.dto.UserAccess;
import eu.keyup.workshop.java8.helper.dto.UserGroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Helper {

    public static List<Integer> range(int from, int to) {
        List<Integer> range = new ArrayList<>(to - from);
        for (int i = from; i < to; i++) {
            range.add(i);
        }
        return range;
    }

    public static Set<User> prepareUserData() {
        UserAccess frontend = new UserAccess("frontend");
        UserAccess poll = new UserAccess("poll");
        UserAccess articles = new UserAccess("articles");
        UserAccess items = new UserAccess("items");
        UserAccess categories = new UserAccess("categories");

        UserGroup basic = new UserGroup("basic");
        basic.getAccesses().add(frontend);

        UserGroup verified = new UserGroup("verified");
        basic.getAccesses().add(frontend);
        basic.getAccesses().add(poll);

        UserGroup administration = new UserGroup("administration");
        administration.getAccesses().add(frontend);
        administration.getAccesses().add(poll);
        administration.getAccesses().add(articles);
        administration.getAccesses().add(items);
        administration.getAccesses().add(categories);

        Set<User> users = new HashSet<>();

        users.add(new User("admin", administration, true));

        users.add(new User("user01", basic, false));
        users.add(new User("user02", basic, false));

        users.add(new User("verified01", verified, true));
        users.add(new User("verified02", verified, false));

        //users.add(new User("no_group_yet", null, true));

        return users;
    }

    public static Set<Person> preparePeople() {
        Set<Person> people = new HashSet<>();

        people.add(new Person(1l, "Jizicek", 2, true));
        people.add(new Person(2l, "Jirka", 10, true));
        people.add(new Person(3l, "Jirka Duchodce", 80, true));
        people.add(new Person(4l, "Jirka Mrtvej", 81, false));

        people.add(new Person(5l, "ALois", 60, true));

        people.add(new Person(6l, "Ferda", 10, true));

        people.add(new Person(7l, "Martin", 80, false));

        return people;
    }

}
