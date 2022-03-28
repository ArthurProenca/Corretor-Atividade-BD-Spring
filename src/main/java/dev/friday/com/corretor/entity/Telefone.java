package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "telefone", length = 11)
    private String telefone;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_pessoa", nullable = false)
    private Pessoa codPessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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