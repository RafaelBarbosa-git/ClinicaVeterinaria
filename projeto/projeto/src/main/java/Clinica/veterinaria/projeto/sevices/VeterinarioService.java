package Clinica.veterinaria.projeto.sevices;

import Clinica.veterinaria.projeto.entities.Veterinario;
import Clinica.veterinaria.projeto.repositories.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public Veterinario cadastrarVeterinario(Veterinario cadastrarVeterinario){
        return veterinarioRepository.save(cadastrarVeterinario);
    }

    public List<Veterinario> listarVeterinarios(){
        return veterinarioRepository.findAll();
    }

    public Veterinario buscarPorId(Long id) {
        return veterinarioRepository.findById(id).orElse(null);
    }

    public void deletarVeterinario(Long id) {
        veterinarioRepository.deleteById(id);
    }
}
