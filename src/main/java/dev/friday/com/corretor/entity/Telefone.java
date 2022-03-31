package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "telefone", length = 11)
    private String telefone;

    @JoinColumn(name = "cod_pessoa", nullable = false)
    private int codPessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}