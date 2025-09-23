package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "prontuarios")
@Data
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String historico;

    @Column
    private String descricao;

    @OneToOne
    @JoinColumn(name = "animal_id", unique = true)
    private Animal animal;
}
