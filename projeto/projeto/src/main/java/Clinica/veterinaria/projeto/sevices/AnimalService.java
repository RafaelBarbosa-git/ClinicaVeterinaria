package Clinica.veterinaria.projeto.sevices;

import Clinica.veterinaria.projeto.entities.Animal;
import Clinica.veterinaria.projeto.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal cadastrarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> listar() {
        return animalRepository.findAll();
    }

    public Animal buscarPorId(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    public Animal atualizar(Long id, Animal dados) {
        Animal animal = animalRepository.findById(id).orElse(null);
        if (animal != null) {
            animal.setNome(dados.getNome());
            animal.setEspecie(dados.getEspecie());
            animal.setIdade(dados.getIdade());
            animal.setTutor(dados.getTutor());
            return animalRepository.save(animal);
        }
        return null;
    }

    public void deletar(Long id) {
        animalRepository.deleteById(id);
    }
}
