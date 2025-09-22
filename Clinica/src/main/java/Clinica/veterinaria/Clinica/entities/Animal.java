package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "animais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 70)
    private String nome;
    @Transient
    private Tutor tutor;

}
