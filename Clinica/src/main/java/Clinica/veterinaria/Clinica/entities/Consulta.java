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

    @Column(nullable = false)
    private String data;

    @Column
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private Veterinario doutor;
}
