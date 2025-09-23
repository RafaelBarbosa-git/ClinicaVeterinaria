package Clinica.veterinaria.Clinica.entities;

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

    @OneToMany(mappedBy = "doutor", cascade = CascadeType.ALL)
    private List<Consulta> consultas = new ArrayList<Consulta>();
}
