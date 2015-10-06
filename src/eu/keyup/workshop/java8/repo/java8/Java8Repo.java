package eu.keyup.workshop.java8.repo.java8;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class Java8Repo<ID, T> {

    private final Map<ID, T> map = new HashMap<>();
    private final Function<T, ID> idMapper;


    public Java8Repo(Function<T, ID> idMapper) {
        this.idMapper = idMapper;
    }

    public void store(T object) {
        map.put(idMapper.apply(object), object);
    }

    public Optional<T> get(ID id) {
        return Optional.ofNullable(map.get(id));
    }

    public Collection<T> getAll() {
        return Collections.unmodifiableCollection(map.values());
    }
}
