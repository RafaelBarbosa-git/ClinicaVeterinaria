package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "prontuarios")
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
