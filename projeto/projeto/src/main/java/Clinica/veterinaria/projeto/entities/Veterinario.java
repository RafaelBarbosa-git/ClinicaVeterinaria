package Clinica.veterinaria.projeto.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "veterinarios")
@Data
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "doutor", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

    @ManyToMany
    @JoinTable(
            name = "veterinario_especialidade",
            joinColumns = @JoinColumn(name = "veterinario_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidade_id")
    )
    private List<Especialidade> especialidades = new ArrayList<>();
}
