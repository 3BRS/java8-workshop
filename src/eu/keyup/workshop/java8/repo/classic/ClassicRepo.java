package eu.keyup.workshop.java8.repo.classic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class ClassicRepo<ID, T> {

    private final Map<ID, T> map = new HashMap<>();

    protected void store(ID id, T object) {
        map.put(id, object);
    }

    public abstract void store(T object);

    public T getOrNull(ID id) {
        return map.get(id);
    }

    public T getOrThrow(ID id) {
        T obj = map.get(id);
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Object with id %s not found", id));
        } else {
            return obj;
        }
    }

    public T getOrDefault(ID id, T defaultObject) {
        T obj = map.get(id);
        if (obj == null) {
            return defaultObject;
        } else {
            return obj;
        }
    }

    public Collection<T> getAll() {
        return map.values();
    }

}
