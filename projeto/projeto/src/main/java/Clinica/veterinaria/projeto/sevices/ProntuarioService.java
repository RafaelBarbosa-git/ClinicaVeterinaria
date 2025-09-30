package Clinica.veterinaria.projeto.sevices;

import Clinica.veterinaria.projeto.entities.Prontuario;
import Clinica.veterinaria.projeto.repositories.ProntuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    // cadastra um novo prontuário
    public Prontuario salvar(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    // lista todos os prontuários do banco
    public List<Prontuario> listar() {
        return prontuarioRepository.findAll();
    }

    // busca um prontuário pelo id
    public Prontuario buscarPorId(Long id) {
        return prontuarioRepository.findById(id).orElse(null);
    }

    // remove um prontuário pelo id
    public void deletar(Long id) {
        prontuarioRepository.deleteById(id);
    }
}
