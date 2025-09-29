package Clinica.veterinaria.Clinica.services;

import Clinica.veterinaria.Clinica.entities.Consulta;
import Clinica.veterinaria.Clinica.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    // Cadastrar nova consulta
    public Consulta cadastrarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
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
            consulta.setDescricao(consultaAtualizada.getDescricao());
            consulta.setData(consultaAtualizada.getData());
            consulta.setVeterinario(consultaAtualizada.getVeterinario());
            return consultaRepository.save(consulta);
        }
        return null;
    }
}
