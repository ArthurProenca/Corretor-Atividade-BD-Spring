package dev.friday.com.corretor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "aluga")
public class Aluga {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_crt", nullable = false)
    private Corretor codCrt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_lct", nullable = false)
    private Pessoa codLct;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_imv", nullable = false)
    private Imovel codImv;

    @Column(name = "data_inicio_alug", nullable = false)
    private LocalDate dataInicioAlug;

    @Column(name = "data_fim_alug", nullable = false)
    private LocalDate dataFimAlug;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataFimAlug() {
        return dataFimAlug;
    }

    public void setDataFimAlug(LocalDate dataFimAlug) {
        this.dataFimAlug = dataFimAlug;
    }

    public LocalDate getDataInicioAlug() {
        return dataInicioAlug;
    }

    public void setDataInicioAlug(LocalDate dataInicioAlug) {
        this.dataInicioAlug = dataInicioAlug;
    }

    public Imovel getCodImv() {
        return codImv;
    }

    public void setCodImv(Imovel codImv) {
        this.codImv = codImv;
    }

    public Pessoa getCodLct() {
        return codLct;
    }

    public void setCodLct(Pessoa codLct) {
        this.codLct = codLct;
    }

    public Corretor getCodCrt() {
        return codCrt;
    }

    public void setCodCrt(Corretor codCrt) {
        this.codCrt = codCrt;
    }
}