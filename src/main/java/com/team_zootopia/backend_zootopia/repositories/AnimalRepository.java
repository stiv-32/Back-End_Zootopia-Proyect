package com.team_zootopia.backend_zootopia.repositories;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.team_zootopia.backend_zootopia.models.Animal;

import lombok.NonNull;


@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
    List findAll = null;

    @NonNull
    Optional<Animal> findById(@NonNull Long id);

    Animal findByName(String name);
}
