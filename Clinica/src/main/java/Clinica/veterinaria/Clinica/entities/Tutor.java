package Clinica.veterinaria.Clinica.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tutores")
@Data
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Clinica.veterinaria.Clinica.entities.Animal> animais = new ArrayList<Clinica.veterinaria.Clinica.entities.Animal>();

}
