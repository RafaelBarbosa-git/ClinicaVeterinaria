package Clinica.veterinaria.projeto.controlleres;

import Clinica.veterinaria.projeto.entities.Especialidade;
import Clinica.veterinaria.projeto.sevices.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeController {

    @Autowired
    private EspecialidadeService especialidadeService;

    @GetMapping
    public List<Especialidade> listarEspecialidade(){
        return especialidadeService.listarEspecialidades();
    }

    @PostMapping
    public Especialidade cadastrarEspecialidade(@RequestBody Especialidade especialidadeCadastrar){
        return especialidadeService.cadastrarEspecialidade(especialidadeCadastrar);
    }
}
