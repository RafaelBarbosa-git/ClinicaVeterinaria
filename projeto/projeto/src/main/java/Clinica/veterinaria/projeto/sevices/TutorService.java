
package Clinica.veterinaria.projeto.sevices;

import Clinica.veterinaria.projeto.entities.Tutor;
import Clinica.veterinaria.projeto.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    // cadastrar novo tutor
    public Tutor cadastrarTutor(Tutor tutorCadastrar) {
        return tutorRepository.save(tutorCadastrar);
    }

    // listar todos os tutores
    public List<Tutor> listarTutores() {
        return tutorRepository.findAll();
    }

    // buscar tutor pelo id
    public Tutor buscarPorId(Long id) {
        return tutorRepository.findById(id).orElse(null);
    }

    // deletar tutor pelo id
    public void deletarTutor(Long id) {
        tutorRepository.deleteById(id);
    }
}
