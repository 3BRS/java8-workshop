package eu.keyup.workshop.java8.repo;

public interface Repo<T> {
    void store(T object);
}
