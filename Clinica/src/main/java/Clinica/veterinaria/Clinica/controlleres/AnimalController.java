package Clinica.veterinaria.Clinica.controlleres;

import Clinica.veterinaria.Clinica.entities.Animal;
import Clinica.veterinaria.Clinica.sevices.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public Animal cadastrarAnimal(@RequestBody Animal animalCadastrar){
        return animalService.cadastrarAnimal(animalCadastrar);
    }
    @GetMapping
    public List<Animal> listarAnimais(){
        return animalService.listarAnimaisPacientes();
    }

}
