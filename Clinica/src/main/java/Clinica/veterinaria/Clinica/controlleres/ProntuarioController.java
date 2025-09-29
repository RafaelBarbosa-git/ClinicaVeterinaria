package Clinica.veterinaria.Clinica.controlleres;

import Clinica.veterinaria.Clinica.entities.Prontuario;
import Clinica.veterinaria.Clinica.sevices.ProntuarioService;
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
        return prontuarioService.cadastrarProntuario(prontuarioCadastrar);
    }

    @GetMapping
    public List<Prontuario> listarProntuarios(){
        return prontuarioService.listarProntuarios();
    }
}
