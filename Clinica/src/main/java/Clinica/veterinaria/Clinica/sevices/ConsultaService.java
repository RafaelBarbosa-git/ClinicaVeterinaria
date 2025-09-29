package Clinica.veterinaria.Clinica.sevices;

import Clinica.veterinaria.Clinica.entities.Animal;
import Clinica.veterinaria.Clinica.entities.Consulta;
import Clinica.veterinaria.Clinica.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public Animal cadastrarConsulta(Consulta cadastrarConsulta){
        return consultaRepository.save(cadastrarConsulta);
    }

    public List<Animal> listarConsultas(){
        return consultaRepository.findAll();
    }

}
