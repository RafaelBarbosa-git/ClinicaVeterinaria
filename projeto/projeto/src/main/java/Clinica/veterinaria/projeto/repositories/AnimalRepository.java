package Clinica.veterinaria.projeto.repositories;

import Clinica.veterinaria.projeto.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
