package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "locador")
public class Locador {
    @Id
    @Column(name = "cod_lcd", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_lcd")
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}