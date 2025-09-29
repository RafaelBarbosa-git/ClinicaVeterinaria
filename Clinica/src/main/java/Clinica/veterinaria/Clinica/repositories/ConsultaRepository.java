package clinica.veterinaria.clinica.repositories;

import clinica.veterinaria.clinica.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
