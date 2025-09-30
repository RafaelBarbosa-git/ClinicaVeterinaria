package Clinica.veterinaria.projeto.controlleres;

import Clinica.veterinaria.projeto.entities.Tutor;
import Clinica.veterinaria.projeto.sevices.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @GetMapping
    public List<Tutor> getAllTutors() {
        return tutorService.listarTutores();
    }

    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        return tutorService.cadastrarTutor(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteTutor(@PathVariable Long id) {
        tutorService.deletarTutor(id);
    }
}