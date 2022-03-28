package dev.friday.com.corretor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "associado")
public class Associado {
    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_nasc", nullable = false)
    private LocalDate dataNasc;

    @Column(name = "tipo_associacao", nullable = false, length = 10)
    private String tipoAssociacao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_lcd", nullable = false)
    private Locador codLcd;

    public Locador getCodLcd() {
        return codLcd;
    }

    public void setCodLcd(Locador codLcd) {
        this.codLcd = codLcd;
    }

    public String getTipoAssociacao() {
        return tipoAssociacao;
    }

    public void setTipoAssociacao(String tipoAssociacao) {
        this.tipoAssociacao = tipoAssociacao;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}