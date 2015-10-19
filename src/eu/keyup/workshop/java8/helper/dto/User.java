package eu.keyup.workshop.java8.helper.dto;

public class User {
    private final String name;
    private UserGroup userGroup;
    private boolean active;

    public User(String name) {
        this.name = name;
    }

    public User(String name, UserGroup userGroup, boolean active) {
        this.name = name;
        this.userGroup = userGroup;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userGroup=" + userGroup +
                ", active=" + active +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return !(name != null ? !name.equals(user.name) : user.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
