package Clinica.veterinaria.projeto.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "especialidades")
@Data
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeEspecialidade;

    @ManyToMany(mappedBy = "especialidades")
    private List<Veterinario> veterinarios;
}
