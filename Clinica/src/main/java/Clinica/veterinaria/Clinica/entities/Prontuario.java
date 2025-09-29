package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "prontuarios")
@Data
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "animal_id", unique = true)
    private Animal animal;

    @OneToMany(mappedBy = "prontuario")
    private List<Consulta> consultas;

    @Column
    private String descricao;


}
