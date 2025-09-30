package Clinica.veterinaria.projeto.entities;

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

    @ManyToOne
    @JoinColumn(name = "prontuario_id")
    private Tutor tutor;

    @OneToMany(mappedBy = "prontuario", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

    @Column
    private String descricao;


}
