package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone {
    @Column(name = "telefone", length = 11)
    private String telefone;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_pessoa", nullable = false)
    private Pessoa codPessoa;

    public Pessoa getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Pessoa codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}