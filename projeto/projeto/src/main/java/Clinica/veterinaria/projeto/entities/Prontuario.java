package Clinica.veterinaria.projeto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JoinColumn(name = "tutor_id")
    @JsonIgnore
    private Tutor tutor;

    @OneToMany(mappedBy = "prontuario", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Consulta> consultas;

    @Column
    private String descricao;


}
