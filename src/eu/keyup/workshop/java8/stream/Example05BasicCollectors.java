package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;
import eu.keyup.workshop.java8.helper.dto.User;

import java.util.Set;
import java.util.stream.Collectors;

public class Example05BasicCollectors {

    public static void main(String[] args) {
        Set<User> users = Helper.prepareUserData();
        System.out.println(users);

        // list of active users

        // list of user groups of active users

        // map of group names per user name

        // multimap of users per groups

        // average number of access rights

        // separate active users
    }

}
