package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "consultas")
@Data
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private Veterinario doutor;

    @Column
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;
}
