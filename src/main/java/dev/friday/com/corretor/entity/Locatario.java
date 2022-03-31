package dev.friday.com.corretor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "locatario")
public class Locatario {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "cod_lct", nullable = false)
    private Integer codLct;

    @Column(name = "data_nasc", nullable = false)
    private LocalDate dataNasc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Integer getCodLct() {
        return codLct;
    }

    public void setCodLct(Integer codLct) {
        this.codLct = codLct;
    }
}