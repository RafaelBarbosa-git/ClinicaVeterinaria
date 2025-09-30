package Clinica.veterinaria.projeto.sevices;

import Clinica.veterinaria.projeto.entities.Consulta;
import Clinica.veterinaria.projeto.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    // Cadastrar nova consulta
    public Consulta cadastrarConsulta(Consulta cadastrarConsulta) {
        return consultaRepository.save(cadastrarConsulta);
    }

    // Buscar consulta por ID
    public Consulta buscarPorId(Long id) {
        return consultaRepository.findById(id).orElse(null);
    }

    // Listar todas as consultas
    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }

    // Deletar consulta por ID
    public void deletarConsulta(Long id) {
        consultaRepository.deleteById(id);
    }

    // Atualizar uma consulta existente
    public Consulta atualizarConsulta(Long id, Consulta consultaAtualizada) {
        Consulta consulta = consultaRepository.findById(id).orElse(null);
        if (consulta != null) {
            consulta.setDiagnostico(consultaAtualizada.getDiagnostico());
            consulta.setData(consultaAtualizada.getData());
            consulta.setDoutor(consultaAtualizada.getDoutor());
            return consultaRepository.save(consulta);
        }
        return null;
    }
}
