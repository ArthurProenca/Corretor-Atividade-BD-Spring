package dev.friday.com.corretor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @Column(name = "cod_pessoa", nullable = false)
    private Integer id;

    @Column(name = "p_nome", nullable = false, length = 40)
    private String pNome;

    @Column(name = "m_inicial", nullable = false, length = 40)
    private String mInicial;

    @Column(name = "u_nome", nullable = false, length = 40)
    private String uNome;

    public String getUNome() {
        return uNome;
    }

    public void setUNome(String uNome) {
        this.uNome = uNome;
    }

    public String getMInicial() {
        return mInicial;
    }

    public void setMInicial(String mInicial) {
        this.mInicial = mInicial;
    }

    public String getPNome() {
        return pNome;
    }

    public void setPNome(String pNome) {
        this.pNome = pNome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}