package eu.keyup.workshop.java8.helper.dto;

import java.util.HashSet;
import java.util.Set;

public class UserGroup {
    private final String name;
    private final Set<UserAccess> accesses = new HashSet<>();

    public UserGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<UserAccess> getAccesses() {
        return accesses;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "name='" + name + '\'' +
                ", accesses=" + accesses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroup userGroup = (UserGroup) o;

        return !(name != null ? !name.equals(userGroup.name) : userGroup.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
