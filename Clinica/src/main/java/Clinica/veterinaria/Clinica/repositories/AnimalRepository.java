package Clinica.veterinaria.Clinica.repositories;

import Clinica.veterinaria.Clinica.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
