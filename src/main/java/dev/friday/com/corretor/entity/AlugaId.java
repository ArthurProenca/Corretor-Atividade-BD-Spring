package dev.friday.com.corretor.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlugaId implements Serializable {
    private static final long serialVersionUID = 1807127668140172442L;
    @Column(name = "cod_crt", nullable = false)
    private Integer codCrt;
    @Column(name = "cod_lct", nullable = false)
    private Integer codLct;
    @Column(name = "cod_imv", nullable = false)
    private Integer codImv;

    public Integer getCodImv() {
        return codImv;
    }

    public void setCodImv(Integer codImv) {
        this.codImv = codImv;
    }

    public Integer getCodLct() {
        return codLct;
    }

    public void setCodLct(Integer codLct) {
        this.codLct = codLct;
    }

    public Integer getCodCrt() {
        return codCrt;
    }

    public void setCodCrt(Integer codCrt) {
        this.codCrt = codCrt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codImv, codCrt, codLct);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AlugaId entity = (AlugaId) o;
        return Objects.equals(this.codImv, entity.codImv) &&
                Objects.equals(this.codCrt, entity.codCrt) &&
                Objects.equals(this.codLct, entity.codLct);
    }
}