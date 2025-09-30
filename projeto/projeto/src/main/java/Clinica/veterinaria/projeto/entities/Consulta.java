package Clinica.veterinaria.projeto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "consultas")
@Data
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String data;

    @Column
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    @JsonIgnore
    private Veterinario doutor;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    @JsonIgnore
    private Animal animal;

    @ManyToOne
    @JoinColumn (name = "prontuario_id")
    @JsonIgnore
    private Prontuario prontuario;
}
