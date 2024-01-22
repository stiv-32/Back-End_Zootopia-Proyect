package com.team_zootopia.backend_zootopia.persistence.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team_zootopia.backend_zootopia.models.Animal;
import com.team_zootopia.backend_zootopia.persistence.IAnimalDAO;
import com.team_zootopia.backend_zootopia.repositories.AnimalRepository;

@Component
public class AnimalDAOImpl implements IAnimalDAO {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll() {
        return (List<Animal>) animalRepository.findAll();
    }

    @Override
    public Optional<Animal> findById(Long id) {
        return animalRepository.findById(Long.valueOf(id));
    }

    @Override
    public Animal findByName(String name) {
        return animalRepository.findByName(name);
    }
}
