package dev.friday.com.corretor.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CorretorLocadorId implements Serializable {
    private static final long serialVersionUID = -6914152766193755288L;
    @Column(name = "cod_lcd", nullable = false)
    private Integer codLcd;
    @Column(name = "cod_crt", nullable = false)
    private Integer codCrt;

    public Integer getCodCrt() {
        return codCrt;
    }

    public void setCodCrt(Integer codCrt) {
        this.codCrt = codCrt;
    }

    public Integer getCodLcd() {
        return codLcd;
    }

    public void setCodLcd(Integer codLcd) {
        this.codLcd = codLcd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCrt, codLcd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CorretorLocadorId entity = (CorretorLocadorId) o;
        return Objects.equals(this.codCrt, entity.codCrt) &&
                Objects.equals(this.codLcd, entity.codLcd);
    }
}