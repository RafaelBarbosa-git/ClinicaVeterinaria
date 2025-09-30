package Clinica.veterinaria.projeto.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "animais")
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 70)
    private String nome;

    @Column
    private String idade;

    @Column
    private String especie;


    @ManyToOne
    @JoinColumn (name = "tutor_id")
    @JsonManagedReference
    private Tutor tutor;

    @OneToOne(mappedBy = "animal", cascade = CascadeType.ALL)
    private Prontuario prontuario;

    @OneToMany(mappedBy = "animal")
    private List<Consulta> consultas;

}
