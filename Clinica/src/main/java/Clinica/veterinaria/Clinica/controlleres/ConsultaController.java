package Clinica.veterinaria.Clinica.controlleres;
import Clinica.veterinaria.Clinica.entities.Consulta;
import Clinica.veterinaria.Clinica.sevices.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")

public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    // Listar todas as consultas
    @GetMapping
    public List<Consulta> listarTodas() {
        return consultaService.listarConsultas();
    }

    // procurar consSulta por ID
    @GetMapping("/{id}")
    public Consulta buscarPorId(@PathVariable Long id) {
        return consultaService.buscarPorId(id);
    }

    // Criar nova consulta
    @PostMapping
    public Consulta criar(@RequestBody Consulta consulta) {
        return consultaService.cadastrarConsulta(consulta);
    }
}

