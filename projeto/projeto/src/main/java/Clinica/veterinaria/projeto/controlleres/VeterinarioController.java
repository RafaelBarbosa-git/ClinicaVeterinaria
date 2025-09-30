package Clinica.veterinaria.projeto.controlleres;

import Clinica.veterinaria.projeto.entities.Veterinario;
import Clinica.veterinaria.projeto.sevices.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @GetMapping
    public List<Veterinario> listarVeterinarios(){
        return veterinarioService.listarVeterinarios();
    }

    @PostMapping
    public Veterinario createVeterinario(@RequestBody Veterinario veterinario) {
        return veterinarioService.cadastrarVeterinario(veterinario);
    }


    @DeleteMapping("/{id}")
    public void deleteVeterinario(@PathVariable Long id) {
        veterinarioService.deletarVeterinario(id);
    }
}
