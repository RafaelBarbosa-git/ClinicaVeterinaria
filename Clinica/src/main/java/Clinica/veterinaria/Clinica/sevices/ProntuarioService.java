package Clinica.veterinaria.Clinica.services;

import Clinica.veterinaria.Clinica.entities.Prontuario;
import Clinica.veterinaria.Clinica.repositories.ProntuarioRepository;
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

    // atualiza um prontuário existente
    public Prontuario atualizar(Long id, Prontuario dados) {
        Prontuario prontuario = prontuarioRepository.findById(id).orElse(null);
        if (prontuario != null) {
            prontuario.setDescricao(dados.getDescricao());
            prontuario.setData(dados.getData());
            prontuario.setAnimal(dados.getAnimal());
            return prontuarioRepository.save(prontuario);
        }
        return null;
    }

    // remove um prontuário pelo id
    public void deletar(Long id) {
        prontuarioRepository.deleteById(id);
    }
}
