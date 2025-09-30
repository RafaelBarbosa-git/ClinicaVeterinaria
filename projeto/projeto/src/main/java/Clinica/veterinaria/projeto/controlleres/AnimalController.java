package Clinica.veterinaria.projeto.controlleres;

import Clinica.veterinaria.projeto.entities.Animal;
import Clinica.veterinaria.projeto.sevices.AnimalService;
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
        return animalService.listar();
    }


    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        animalService.deletar(id);
    }
}
