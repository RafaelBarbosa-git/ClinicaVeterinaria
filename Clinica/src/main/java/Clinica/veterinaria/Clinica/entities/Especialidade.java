package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidades")
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
