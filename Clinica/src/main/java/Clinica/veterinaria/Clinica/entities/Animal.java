package Clinica.veterinaria.Clinica.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @ManyToOne
    @JoinColumn (name = "tutor_id")
    @JsonManagedReference
    private Tutor tutor;
    @OneToOne(mappedBy = "animal", cascade = CascadeType.ALL)
    private Prontuario prontuario;

}
