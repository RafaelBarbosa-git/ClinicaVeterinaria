package Clinica.veterinaria.projeto.sevices;

import Clinica.veterinaria.projeto.entities.Especialidade;
import Clinica.veterinaria.projeto.repositories.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadeService {

    @Autowired
    private EspecialidadeRepository especialidadeRepository;


    public List<Especialidade> listarEspecialidades(){
        return especialidadeRepository.findAll();
    }

    public Especialidade cadastrarEspecialidade(Especialidade especialidade){
        return especialidadeRepository.save(especialidade);
    }

}
