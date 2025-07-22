package local.repositories;

import java.util.List;
import java.util.Optional;

public interface IDAO<E> {

    List<E> findAll();

    // <ID> E findById(ID id) throws Exception; // OPTION 1
    <ID> Optional<E> findById(ID id);

    E save(E entity);

    void update(E entity);

    // <ID> void delete(ID id);
    void delete(E entity);
}
