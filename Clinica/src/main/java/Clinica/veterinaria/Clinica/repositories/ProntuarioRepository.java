package Clinica.veterinaria.Clinica.repositories;

import Clinica.veterinaria.Clinica.entities.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
}
