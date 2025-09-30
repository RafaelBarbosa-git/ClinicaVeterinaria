
package Clinica.veterinaria.Clinica.services;

import Clinica.veterinaria.Clinica.entities.Tutor;
import Clinica.veterinaria.Clinica.repositories.TutorRepository;
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

    // atualizar dados do tutor
    public Tutor atualizarTutor(Long id, Tutor dados) {
        Tutor tutor = tutorRepository.findById(id).orElse(null);
        if (tutor != null) {
            tutor.setNome(dados.getNome());
            tutor.setTelefone(dados.getTelefone());
            tutor.setEndereco(dados.getEndereco());
            return tutorRepository.save(tutor);
        }
        return null;
    }

    // deletar tutor pelo id
    public void deletarTutor(Long id) {
        tutorRepository.deleteById(id);
    }
}
