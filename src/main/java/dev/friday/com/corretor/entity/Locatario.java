package dev.friday.com.corretor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "locatario")
public class Locatario {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_lct", nullable = false)
    private Pessoa codLct;

    @Column(name = "data_nasc", nullable = false)
    private LocalDate dataNasc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Pessoa getCodLct() {
        return codLct;
    }

    public void setCodLct(Pessoa codLct) {
        this.codLct = codLct;
    }
}