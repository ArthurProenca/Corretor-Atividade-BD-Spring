package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "regras_condominio")
public class RegrasCondominio {
    @EmbeddedId
    private RegrasCondominioId id;

    @MapsId("codImv")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_imv", nullable = false)
    private Imovel codImv;

    public Imovel getCodImv() {
        return codImv;
    }

    public void setCodImv(Imovel codImv) {
        this.codImv = codImv;
    }

    public RegrasCondominioId getId() {
        return id;
    }

    public void setId(RegrasCondominioId id) {
        this.id = id;
    }
}