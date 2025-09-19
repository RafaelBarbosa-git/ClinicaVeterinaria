package Clinica.veterinaria.Clinica.sevices;

import Clinica.veterinaria.Clinica.entities.Animal;
import Clinica.veterinaria.Clinica.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal cadastrarAnimal(Animal animalCadastrar){
        return animalRepository.save(animalCadastrar);
    }

    public List<Animal> listarAnimaisPacientes(){
        return animalRepository.findAll();
    }
}
