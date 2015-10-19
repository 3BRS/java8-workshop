package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;
import eu.keyup.workshop.java8.helper.dto.User;

import java.util.Set;

public class Example03MoreComplexLooping {

    public static void main(String[] args) {
        Set<User> users = Helper.prepareUserData();
        System.out.println(users);

        // todo: count active users

        // todo: names of active users

        // todo: names of rights of all active users sorted by name

        // todo: * null + method order executions
    }



}
