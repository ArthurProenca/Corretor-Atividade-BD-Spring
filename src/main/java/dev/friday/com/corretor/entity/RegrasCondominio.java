package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "regras_condominio")
public class RegrasCondominio {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_imv", nullable = false)
    private Imovel codImv;

    @Column(name = "regra")
    private String regra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegra() {
        return regra;
    }

    public void setRegra(String regra) {
        this.regra = regra;
    }

    public Imovel getCodImv() {
        return codImv;
    }

    public void setCodImv(Imovel codImv) {
        this.codImv = codImv;
    }
}