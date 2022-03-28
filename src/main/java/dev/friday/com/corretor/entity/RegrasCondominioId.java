package dev.friday.com.corretor.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RegrasCondominioId implements Serializable {
    private static final long serialVersionUID = 2027288074494063411L;
    @Column(name = "cod_imv", nullable = false)
    private Integer codImv;
    @Column(name = "regra", nullable = false)
    private String regra;

    public String getRegra() {
        return regra;
    }

    public void setRegra(String regra) {
        this.regra = regra;
    }

    public Integer getCodImv() {
        return codImv;
    }

    public void setCodImv(Integer codImv) {
        this.codImv = codImv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codImv, regra);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RegrasCondominioId entity = (RegrasCondominioId) o;
        return Objects.equals(this.codImv, entity.codImv) &&
                Objects.equals(this.regra, entity.regra);
    }
}