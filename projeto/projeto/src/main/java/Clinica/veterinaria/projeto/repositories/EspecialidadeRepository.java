package Clinica.veterinaria.projeto.repositories;

import Clinica.veterinaria.projeto.entities.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}
