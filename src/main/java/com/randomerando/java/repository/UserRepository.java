package com.randomerando.java.repository;

import com.randomerando.java.model.utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<utilisateur, Integer> {
}
