package Clinica.veterinaria.Clinica.controlleres;

import Clinica.veterinaria.Clinica.entities.Tutor;
import Clinica.veterinaria.Clinica.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorRepository tutorRepository;

    @GetMapping
    public List<Tutor> getAllTutors() {
        return tutorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutor> getTutorById(@PathVariable Long id) {
        Optional<Tutor> tutor = tutorRepository.findById(id);
        return tutor.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutor> updateTutor(@PathVariable Long id, @RequestBody Tutor tutorDetails) {
        Optional<Tutor> tutor = tutorRepository.findById(id);

        if (tutor.isPresent()) {
            Tutor existingTutor = tutor.get();
            existingTutor.setNome(tutorDetails.getNome());
            existingTutor.setEmail(tutorDetails.getEmail());
            Tutor updatedTutor = tutorRepository.save(existingTutor);
            return ResponseEntity.ok(updatedTutor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutor(@PathVariable Long id) {
        Optional<Tutor> tutor = tutorRepository.findById(id);
        if (tutor.isPresent()) {
            tutorRepository.delete(tutor.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}