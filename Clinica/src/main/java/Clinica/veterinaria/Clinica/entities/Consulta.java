package Clinica.veterinaria.Clinica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String data; // poderia ser LocalDate, mas vamos deixar String para simplificar

    @Column(nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private Veterinario doutor;

    // Construtores
    public Consulta() {
    }

    public Consulta(String data, String descricao, Veterinario doutor) {
        this.data = data;
        this.descricao = descricao;
        this.doutor = doutor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Veterinario getDoutor() {
        return doutor;
    }

    public void setDoutor(Veterinario doutor) {
        this.doutor = doutor;
    }
}
