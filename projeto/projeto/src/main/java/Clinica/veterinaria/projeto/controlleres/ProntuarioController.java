package Clinica.veterinaria.projeto.controlleres;

import Clinica.veterinaria.projeto.entities.Prontuario;
import Clinica.veterinaria.projeto.sevices.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prontuario")

public class ProntuarioController {

    @Autowired
    private ProntuarioService prontuarioService;

    @PostMapping
    public Prontuario cadastrarProntuario(@RequestBody Prontuario prontuarioCadastrar){
        return prontuarioService.salvar(prontuarioCadastrar);
    }

    @GetMapping
    public List<Prontuario> listarProntuarios(){
        return prontuarioService.listar();
    }

    @DeleteMapping("/{id}")
    public void deleteProntuario(@PathVariable Long id) {
        prontuarioService.deletar(id);
    }
}
