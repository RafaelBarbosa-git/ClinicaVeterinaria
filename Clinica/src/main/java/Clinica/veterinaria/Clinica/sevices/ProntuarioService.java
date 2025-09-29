package Clinica.veterinaria.Clinica.sevices;

import Clinica.veterinaria.Clinica.entities.Prontuario;
import Clinica.veterinaria.Clinica.repositories.ProntuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    public Prontuario cadastrarProntuario(Prontuario prontuarioCadastrar){
        return prontuarioRepository.save(prontuarioCadastrar);
    }

    public List<Prontuario> listarProntuarios(){
        return prontuarioRepository.findAll();
    }
}
