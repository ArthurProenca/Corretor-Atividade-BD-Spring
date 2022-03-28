package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "corretor_locador")
public class CorretorLocador {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_lcd", nullable = false)
    private Locador codLcd;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_crt", nullable = false)
    private Corretor codCrt;

    @Column(name = "comissao", nullable = false)
    private Double comissao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Corretor getCodCrt() {
        return codCrt;
    }

    public void setCodCrt(Corretor codCrt) {
        this.codCrt = codCrt;
    }

    public Locador getCodLcd() {
        return codLcd;
    }

    public void setCodLcd(Locador codLcd) {
        this.codLcd = codLcd;
    }
}