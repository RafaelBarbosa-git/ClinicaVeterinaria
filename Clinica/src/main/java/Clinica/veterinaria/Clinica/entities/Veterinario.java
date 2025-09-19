package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "veterinarios")
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
