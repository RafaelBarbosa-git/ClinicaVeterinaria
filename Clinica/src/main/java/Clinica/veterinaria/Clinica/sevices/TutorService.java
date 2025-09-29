package Clinica.veterinaria.Clinica.sevices;

import Clinica.veterinaria.Clinica.entities.Tutor;
import Clinica.veterinaria.Clinica.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public Tutor cadastrarTutor(Tutor tutorCadastrar) {
        return tutorRepository.save(tutorCadastrar);
    }

    public List<Tutor> litarTutoresDonos(){
        return tutorRepository.findAll();
    }


}
