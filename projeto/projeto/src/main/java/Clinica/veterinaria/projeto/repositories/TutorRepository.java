package Clinica.veterinaria.projeto.repositories;

import Clinica.veterinaria.projeto.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {
}
