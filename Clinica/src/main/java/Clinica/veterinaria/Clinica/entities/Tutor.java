package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
