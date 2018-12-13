package com.randomerando.java.repository;
        import com.randomerando.java.model.rando;
        import org.springframework.data.repository.CrudRepository;

public interface RandoRepository extends CrudRepository<rando, Integer> {
}
